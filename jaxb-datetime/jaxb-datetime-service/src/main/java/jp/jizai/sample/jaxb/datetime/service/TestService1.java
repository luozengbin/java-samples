package jp.jizai.sample.jaxb.datetime.service;

import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import jp.jizai.sample.jaxb.datetime.model.DateTestModel1;
import jp.jizai.sample.jaxb.datetime.model.DateTestModel4;
import jp.jizai.sample.jaxb.datetime.util.XMLGregorianCalendarUtil;

@WebService(targetNamespace = "http://sample.jizai.jp/jaxb/datetime/service")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)
public class TestService1 {

    @WebMethod(action = "run")
    @WebResult(name = "DateTestModel4", partName = "parameter", targetNamespace = "http://sample.jizai.jp/jaxb/datetime/model")
    public DateTestModel4 run(
            @WebParam(name = "DateTestModel1", partName = "parameter", targetNamespace = "http://sample.jizai.jp/jaxb/datetime/model") DateTestModel1 parameter) {
        
        Date datetime = XMLGregorianCalendarUtil.toDate(parameter.getDatetime());

        DateTestModel4 result = new DateTestModel4();
        result.setDatetime(datetime.toString());
        return result;
    }

}
