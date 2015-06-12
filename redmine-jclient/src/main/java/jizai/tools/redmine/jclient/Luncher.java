/*
 * Copyright (C) 2014, 2015  Akira Wakana
 *
 *  Author: Akira Wakana <jalen.cn@gmail.com>
 *  URL: https://luozengbin.github.io
 *  Keywords: bts, redmine, tool
 *  Version: 1.0.0
 *
 *  This program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package jizai.tools.redmine.jclient;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import jizai.tools.redmine.jclient.model.IssueResponse;

import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.moxy.json.MoxyJsonFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * java8 steam api でエクセルから行を読み込み タスクを起こして、ExecutorServiceに起票処理を行う
 */
public class Luncher {

	private static Logger LOGGER = LoggerFactory.getLogger(Luncher.class);

	/**
	 * args[0] confファイルのパス
	 * 
	 * @param args
	 * @throws FileNotFoundException
	 * @throws UnsupportedEncodingException
	 * @throws JAXBException
	 */
	public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException, JAXBException {

		System.setProperty("jaxp.debug", "true");
		System.setProperty("jaxb.debug", "true");

		if (args.length == 0) {
			System.err.println("confファイルを指定してください。");
			System.exit(1);
		}

		System.setProperty(JAXBContext.JAXB_CONTEXT_FACTORY, "org.eclipse.persistence.jaxb.JAXBContextFactory");
		System.setProperty(ToolConfig.TOOL_CONF, args[0]);

		ToolConfig toolConfig = ToolConfig.instance();

		ClientConfig config = new ClientConfig();
		config.register(MoxyJsonFeature.class);

		Client client = ClientBuilder.newClient(config);

		WebTarget target = client.target(toolConfig.getHostURL()).queryParam("key", toolConfig.getApiKey()).path("issues/{id}.json");

		// 次の流れでjsonパース及びデータバインディング処理が実施される
		// org.glassfish.jersey.message.internal.MessageBodyFactory
		// --> org.glassfish.jersey.moxy.json.internal.ConfigurableMoxyJsonProvider
		// --> org.eclipse.persistence.jaxb.rs.MOXyJsonProvider.readFrom
		// --> org.eclipse.persistence.jaxb.rs.MOXyJsonProvider.getJAXBContext
		// --> org.eclipse.persistence.jaxb.JAXBContextFactory.createContext
		// JAXBContextの作成は標準APIを利用せずに、直接MoxyのJAXBContextFactoryを使っている
		IssueResponse issue = target.resolveTemplate("id", 1).request(MediaType.APPLICATION_JSON).get(IssueResponse.class);
		System.out.println(issue.getIssue());
	}
}
