package jp.jizai.sample.jaxb.datetime.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class DateUtil {
    private final ThreadLocal<DateFormat> dflocal = new ThreadLocal<DateFormat>() {
        @Override
        protected DateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        }
    };

    public DateFormat getDateFormatInstance() {
        return dflocal.get();
    }


}
