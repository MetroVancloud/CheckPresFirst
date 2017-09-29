package com.aturstudio.pojo;

import java.io.Serializable;

/**
 * Created by vancloud on 2017/9/28.
 */
public class CheckPresOutputTemp implements Serializable {

    private String patientId;	//  varchar2(100)	y		患者id，非唯一值索引
    private String checkOutput;	//  long	y		处方审核结果
    private int lookTag;	    //  number	y	0	审核结果是否已经看过，1表示已经看过，0表示没有看过
    private String presDate;	//  date	y	sysdate	处方日期
    private String id;	        //  varchar2(100)			处方唯一编号

    private static final long serialVersionUID = 1L;

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getCheckOutput() {
        return checkOutput;
    }

    public void setCheckOutput(String checkOutput) {
        this.checkOutput = checkOutput;
    }

    public int getLookTag() {
        return lookTag;
    }

    public void setLookTag(int lookTag) {
        this.lookTag = lookTag;
    }

    public String getPresDate() {
        return presDate;
    }

    public void setPresDate(String presDate) {
        this.presDate = presDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
