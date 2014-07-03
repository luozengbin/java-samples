package jp.jizai.sample.jaxb.datetime.service;

import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import jp.jizai.sample.jaxb.datetime.model.DateTestModel2;
import jp.jizai.sample.jaxb.datetime.model.DateTestModel4;

@WebService(targetNamespace = "http://sample.jizai.jp/jaxb/datetime/service")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)
public class TestService2 {

    @WebMethod(action = "run")
    @WebResult(name = "DateTestModel4", partName = "parameter", targetNamespace = "http://sample.jizai.jp/jaxb/datetime/model")
    public DateTestModel4 run(
            @WebParam(name = "DateTestModel2", partName = "parameter", targetNamespace = "http://sample.jizai.jp/jaxb/datetime/model") DateTestModel2 parameter) {
        
        Date datetime = parameter.getDatetime();
        DateTestModel4 result = new DateTestModel4();
        result.setDatetime(datetime.toString());
        return result;
    }

}
