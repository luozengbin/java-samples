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

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

import org.eclipse.persistence.jaxb.UnmarshallerProperties;

import lombok.Data;

@Data
public class ToolConfig {

	public static final String TOOL_CONF = "jizai.tools.redmine.jclient.ToolConfig";
	public static final String CHARSET_NAME = "UTF-8";

	private static final Object lock = new Object();
	private static ToolConfig singleInstance = null;

	
	/**
	 * TOOL_CONFシステムプロパティ値でconfファイルを読み込み.
	 * @return
	 */
	public static ToolConfig instance() {
		if (singleInstance == null) {
			synchronized (lock) {
				try {
					if (singleInstance == null) {
						JAXBContext jaxbContext = JAXBContext.newInstance(ToolConfig.class);
						Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
						unmarshaller.setProperty(UnmarshallerProperties.MEDIA_TYPE, MediaType.APPLICATION_JSON);
						unmarshaller.setProperty(UnmarshallerProperties.JSON_INCLUDE_ROOT, false);
						String confFile = System.getProperty(TOOL_CONF);
						Reader entityReader = new InputStreamReader(new FileInputStream(confFile), CHARSET_NAME);
						StreamSource jsonSource = new StreamSource(entityReader);
						singleInstance = unmarshaller.unmarshal(jsonSource, ToolConfig.class).getValue();
					}
				} catch (Exception e) {
					throw new RuntimeException(e);
				}
			}
		}
		return singleInstance;
	}

	private String hostURL;
	private String apiKey;

}
