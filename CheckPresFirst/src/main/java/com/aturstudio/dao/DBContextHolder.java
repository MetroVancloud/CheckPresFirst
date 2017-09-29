package com.aturstudio.dao;

/**
 * Created by vancloud on 2017/9/28.
 */
public class DBContextHolder {

    public static final String PDSS = "pdss";
    public static final String PEAAS = "peaas";

    private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();

    public static void setDBType(String dbType) {
        contextHolder.set(dbType);
    }

    public static String getDBType() {
        return contextHolder.get();
    }

    public static void clearDBType() {
        contextHolder.remove();
    }
}
