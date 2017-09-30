package com.aturstudio.dao;

import com.aturstudio.pojo.CheckPresInputTemp;
import com.aturstudio.mapper.CheckPresInputTempRowMapper;
import com.aturstudio.util.TimeUtil;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by vancloud on 2017/9/28.
 */
@Repository
public class CheckPresInputTempDAO extends AbstractDAO{
    /**
     * 根据处方 id 查找一条临时处方详情
     * @param pres_id
     * @return
     */
    public CheckPresInputTemp getEntry(String pres_id){
        String sql = "select * from check_pres_input_temp where pres_id = ? ";
        JdbcTemplate jt = getJdbcTemplate();
        List<CheckPresInputTemp> list = jt.query(sql, new Object[]{pres_id}, new CheckPresInputTempRowMapper());

        if (null == list || list.size() == 0) {
            return new CheckPresInputTemp();
        } else {
            return list.get(0);
        }

    }

    public int batchInsertInputTempList(List<CheckPresInputTemp> list) {
        return batchInsert(list);
    }

    private int batchInsert(List<CheckPresInputTemp> list) {
        final List<CheckPresInputTemp> batchList = list;
        /*String sql = "insert into check_pres_input_temp " +
                "  (patient_id, check_input, look_tag, pres_date, id, patient_name, " +
                "   pres_id, doctor_id, doctor_name, dept_code, dept_name, warm_level) " +
                "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        int[] counts = this.getJdbcTemplate().batchUpdate(sql, new BatchPreparedStatementSetter() {

            public void setValues(PreparedStatement ps, int i) throws SQLException {
                ps.setString(1, batchList.get(i).getPatientId());
                ps.setString(2, batchList.get(i).getCheckInput());
                ps.setInt(3, batchList.get(i).getLookTag());
                ps.setTime(4, TimeUtil.strToSqlTimeWithFullFormat(batchList.get(i).getPresDate()));
                ps.setString(5, batchList.get(i).getId());
                ps.setString(6, batchList.get(i).getPatientName());
                ps.setString(7, batchList.get(i).getPresId());
                ps.setString(8, batchList.get(i).getDoctorId());
                ps.setString(9, batchList.get(i).getDoctorName());
                ps.setString(10, batchList.get(i).getDeptCode());
                ps.setString(11, batchList.get(i).getDeptName());
                ps.setInt(12, batchList.get(i).getWarmLevel());

            }

            public int getBatchSize() {
                return batchList.size();
            }
        });*/
        String sql = "insert into check_pres_input_temp " +
                "  (patient_id, check_input, look_tag, id, patient_name, " +
                "   pres_id, doctor_id, doctor_name, dept_code, dept_name, warm_level) " +
                "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        int[] counts = this.getJdbcTemplate().batchUpdate(sql, new BatchPreparedStatementSetter() {

            public void setValues(PreparedStatement ps, int i) throws SQLException {
                ps.setString(1, batchList.get(i).getPatientId());
                ps.setString(2, batchList.get(i).getCheckInput());
                ps.setInt(3, batchList.get(i).getLookTag());
                ps.setString(4, batchList.get(i).getId());
                ps.setString(5, batchList.get(i).getPatientName());
                ps.setString(6, batchList.get(i).getPresId());
                ps.setString(7, batchList.get(i).getDoctorId());
                ps.setString(8, batchList.get(i).getDoctorName());
                ps.setString(9, batchList.get(i).getDeptCode());
                ps.setString(10, batchList.get(i).getDeptName());
                ps.setInt(11, batchList.get(i).getWarmLevel());

            }

            public int getBatchSize() {
                return batchList.size();
            }
        });

        return counts.length;
    }

    public static void main(String[] args) {
        CheckPresInputTempDAO dao = new CheckPresInputTempDAO();
        //CheckPresInputTemp temp = dao.getEntry("H01825294_2017:06:23:09:40:57");
        List<CheckPresInputTemp> list = new ArrayList<CheckPresInputTemp>();

        CheckPresInputTemp temp  = new CheckPresInputTemp();
        temp.setPresDate("2017-09-30 21:11:11");
        temp.setPresId("1112_2017:09:30:21:11:11");
        temp.setId("11112");

        list.add(temp);

        System.out.println(dao.batchInsert(list));

        //System.out.println(temp.getPatientId());
    }

}
