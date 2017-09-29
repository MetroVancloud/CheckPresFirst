package com.aturstudio.mapper;

import com.aturstudio.pojo.CheckPresInputTemp;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by vancloud on 2017/9/28.
 */
public class CheckPresInputTempRowMapper implements RowMapper<CheckPresInputTemp> {

    public CheckPresInputTemp mapRow(ResultSet rs, int rowNum) throws SQLException {
        CheckPresInputTemp entry = new CheckPresInputTemp();
        entry.setPatientId(rs.getString("patient_id"));
        entry.setCheckInput(rs.getString("check_input"));
        entry.setLookTag(rs.getInt("look_tag"));
        entry.setPresDate(rs.getString("pres_date").substring(0, 19));
        entry.setId(rs.getString("id"));
        entry.setPatientName(rs.getString("patient_name"));
        entry.setPresId(rs.getString("pres_id"));
        entry.setDoctorId(rs.getString("doctor_id"));
        entry.setDoctorName(rs.getString("doctor_name"));
        entry.setDeptCode(rs.getString("dept_code"));
        entry.setDeptName(rs.getString("dept_name"));
        entry.setWarmLevel(rs.getInt("warm_level"));

        return entry;
    }


}
