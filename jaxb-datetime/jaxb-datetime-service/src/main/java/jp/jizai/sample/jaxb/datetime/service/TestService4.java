package jp.jizai.sample.jaxb.datetime.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import jp.jizai.sample.jaxb.datetime.model.DateTestModel4;

@WebService(targetNamespace = "http://sample.jizai.jp/jaxb/datetime/service")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)
public class TestService4 {

    @WebMethod(action = "run")
    @WebResult(name = "DateTestModel4", partName = "parameter", targetNamespace = "http://sample.jizai.jp/jaxb/datetime/model")
    public DateTestModel4 run(
            @WebParam(name = "DateTestModel4", partName = "parameter", targetNamespace = "http://sample.jizai.jp/jaxb/datetime/model") DateTestModel4 parameter) {
        
//        parameter.getDatetime()
        DateTestModel4 result = new DateTestModel4();
//        result.setDatetime(parameter.getDatetime().toString());
        
        return result;
    }

}
