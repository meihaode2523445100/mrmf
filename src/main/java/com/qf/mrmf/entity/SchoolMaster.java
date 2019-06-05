package com.qf.mrmf.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class SchoolMaster {
    private Integer sm_id;
    private String sm_letter;
    private Date sm_time;
    private Integer c_id;

    public Integer getSm_id() {
        return sm_id;
    }

    public void setSm_id(Integer sm_id) {
        this.sm_id = sm_id;
    }

    public String getSm_letter() {
        return sm_letter;
    }

    public void setSm_letter(String sm_letter) {
        this.sm_letter = sm_letter;
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getSm_time() {
        return sm_time;
    }

    public void setSm_time(Date sm_time) {
        this.sm_time = sm_time;
    }

    public Integer getC_id() {
        return c_id;
    }

    public void setC_id(Integer c_id) {
        this.c_id = c_id;
    }
}
