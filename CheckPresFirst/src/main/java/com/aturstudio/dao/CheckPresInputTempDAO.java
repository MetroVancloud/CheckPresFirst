package com.aturstudio.dao;

import com.aturstudio.pojo.CheckPresInputTemp;
import com.aturstudio.mapper.CheckPresInputTempRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * 该类用于测试多数据源
 * 可以删除
 * Created by vancloud on 2017/9/28.
 */


@Repository
public class CheckPresInputTempDAO extends AbstractDAO{

    public CheckPresInputTemp getEntry(String id){
        String sql = "select * from check_pres_input_temp where id = ? ";
        DBContextHolder.setDBType(DBContextHolder.PDSS);
        JdbcTemplate jt = this.getJdbcTemplate();
        List<CheckPresInputTemp> list = jt.query(sql, new Object[]{id}, new CheckPresInputTempRowMapper());

        if (null == list || list.size() == 0) {
            return new CheckPresInputTemp();
        } else {
            return list.get(0);
        }

    }

    public static void main(String[] args) {
        CheckPresInputTempDAO dao = new CheckPresInputTempDAO();
        CheckPresInputTemp temp = dao.getEntry("H01825294_2017:06:23:09:40:57");
        System.out.println(temp.getPatientId());
    }

}
