package com.aturstudio.listener;

import com.aturstudio.pojo.CheckPresInputTemp;
import com.aturstudio.service.CheckPresInputTempService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.sleep;

/**
 * Created by vancloud on 2017/9/30.
 */
public class InsertTempPresTask implements Runnable {
//    private static final DeliverRecordCache RECORD_CACHE = DeliverRecordCache.getInstance();
//    private static Logger logger = LoggerFactory.getLogger(DeliverRecordClear.class);
    @Autowired
    private CheckPresInputTempService service = new CheckPresInputTempService();

    @Override
    public void run() {
        while(true) {
            long begin = System.currentTimeMillis();
            List<CheckPresInputTemp> list = new ArrayList<CheckPresInputTemp>();

            CheckPresInputTemp temp  = new CheckPresInputTemp();
            //temp.setPresDate("2017-09-30 21:11:11");
            temp.setPresId("1112_2017:09:30:21:11:11");
            temp.setId("11112");

            list.add(temp);

            service.batchInsertInputTempList(list);
            long end = System.currentTimeMillis();

            System.out.println("批处理插入花费：" + (end - begin)+ " ms");
            //logger.info("time:{} ms", end - begin);
            try {
                sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }

}
