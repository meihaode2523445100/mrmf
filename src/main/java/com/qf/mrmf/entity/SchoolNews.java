package com.qf.mrmf.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class SchoolNews {

    private Integer sn_id;
    private String sn_title;
    private String sn_detail;
    private Date sn_pushtime;
    private Integer c_id;

    public Integer getSn_id() {
        return sn_id;
    }

    public void setSn_id(Integer sn_id) {
        this.sn_id = sn_id;
    }

    public String getSn_title() {
        return sn_title;
    }

    public void setSn_title(String sn_title) {
        this.sn_title = sn_title;
    }

    public String getSn_detail() {
        return sn_detail;
    }

    public void setSn_detail(String sn_detail) {
        this.sn_detail = sn_detail;
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getSn_pushtime() {
        return sn_pushtime;
    }

    public void setSn_pushtime(Date sn_pushtime) {
        this.sn_pushtime = sn_pushtime;
    }

    public Integer getC_id() {
        return c_id;
    }

    public void setC_id(Integer c_id) {
        this.c_id = c_id;

    }

}
