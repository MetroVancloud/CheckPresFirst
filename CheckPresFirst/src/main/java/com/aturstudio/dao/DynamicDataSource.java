package com.aturstudio.dao;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Created by vancloud on 2017/9/28.
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return DBContextHolder.getDBType();
    }
}
