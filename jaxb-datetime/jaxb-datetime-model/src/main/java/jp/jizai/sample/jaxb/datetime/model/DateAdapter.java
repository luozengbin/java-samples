package jp.jizai.sample.jaxb.datetime.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class DateAdapter extends XmlAdapter<String, Date> {

    private final ThreadLocal<DateFormat> dflocal = new ThreadLocal<DateFormat>() {
        @Override
        protected DateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        }
    };

    @Override
    public String marshal(Date v) throws Exception {
        return dflocal.get().format(v);
    }

    @Override
    public Date unmarshal(String v) throws Exception {
        return dflocal.get().parse(v);
    }

}
