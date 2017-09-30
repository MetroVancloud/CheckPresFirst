package com.aturstudio.dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * Created by vancloud on 2017/9/28.
 */
public class AbstractDAO{
    public static String PDSS = "pdss";
    public static String PEAAS = "peaas";

    private DataSource ds;
    private JdbcTemplate jdbcTemplate;

    public AbstractDAO() {
        ds = new ComboPooledDataSource();   //  连接默认的数据源
        jdbcTemplate = new JdbcTemplate(ds);
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setDataSource (String dataSourceName) {
        ds = new ComboPooledDataSource(dataSourceName);
        jdbcTemplate = new JdbcTemplate(ds);
    }

}
