package com.aturstudio.util;

import java.text.SimpleDateFormat;

/**
 * Created by vancloud on 2017/9/30.
 */
public class TimeUtil {

    public static java.sql.Time strToSqlTimeWithFullFormat (String str) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        java.util.Date d = null;
        try {
            d = format.parse(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new java.sql.Time(d.getTime());
    }
}
