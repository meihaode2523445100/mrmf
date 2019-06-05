package com.qf.mrmf.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class JobJServer {
    private Integer jss_id;
    private String jss_title;
    private String jss_detail;
    private Date jss_pushtime;
    private Integer c_id;

    public Integer getJss_id() {
        return jss_id;
    }

    public void setJss_id(Integer jss_id) {
        this.jss_id = jss_id;
    }

    public String getJss_title() {
        return jss_title;
    }

    public void setJss_title(String jss_title) {
        this.jss_title = jss_title;
    }

    public String getJss_detail() {
        return jss_detail;
    }

    public void setJss_detail(String jss_detail) {
        this.jss_detail = jss_detail;
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getJss_pushtime() {
        return jss_pushtime;
    }

    public void setJss_pushtime(Date jss_pushtime) {
        this.jss_pushtime = jss_pushtime;
    }

    public Integer getC_id() {
        return c_id;
    }

    public void setC_id(Integer c_id) {
        this.c_id = c_id;
    }
}
