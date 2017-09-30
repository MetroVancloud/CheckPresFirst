package com.aturstudio.pojo;

import java.io.Serializable;

/**
 * Created by vancloud on 2017/9/28.
 */
public class CheckPresInputTemp implements Serializable {

    private String patientId = "";	//  varchar2(100)	y		患者id，非唯一值索引
    private String checkInput = "";	//  long	y		处方信息
    private int lookTag;	    //  number	y	0	审核结果是否已经看过，1表示已经看过，0表示没有看过
    private String presDate;	//  date	y	sysdate	处方日期
    private String id = "";	        //  varchar2(100)			处方唯一编号
    private String patientName = "";	//  varchar2(100)	y		患者姓名
    private String presId = "";	    //  varchar2(100)	y		处方号
    private String doctorId = "";	//  varchar2(100)	y		医生id
    private String doctorName = "";	//  varchar2(100)	y		医生姓名
    private String deptCode = "";	//  varchar2(100)	y		科室编码
    private String deptName = "";	//  varchar2(100)	y		科室名称
    private int warmLevel;	    //  number	y		处方警告级别，-1表示拦截，0表示没有问题，1表示慎用，2表示禁忌（取一个处方中最严重的警告级别）

    private static final long serialVersionUID = 1L;

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getCheckInput() {
        return checkInput;
    }

    public void setCheckInput(String checkInput) {
        this.checkInput = checkInput;
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

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPresId() {
        return presId;
    }

    public void setPresId(String presId) {
        this.presId = presId;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public int getWarmLevel() {
        return warmLevel;
    }

    public void setWarmLevel(int warmLevel) {
        this.warmLevel = warmLevel;
    }
}
