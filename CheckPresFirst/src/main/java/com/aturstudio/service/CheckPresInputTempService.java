package com.aturstudio.service;

import com.aturstudio.dao.CheckPresInputTempDAO;
import com.aturstudio.pojo.CheckPresInputTemp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by vancloud on 2017/9/30.
 */
@Service
public class CheckPresInputTempService {

    @Autowired
    private CheckPresInputTempDAO dao = new CheckPresInputTempDAO();

    /**
     * 批量插入服务方法
     * @param list
     * @return
     */
    public int batchInsertInputTempList(List<CheckPresInputTemp> list) {
        return dao.batchInsertInputTempList(list);
    }

}
