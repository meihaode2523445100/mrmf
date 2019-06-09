package com.qf.mrmf.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class JobStar {
    private Integer js_id;
    private String js_name;
    private String js_img;
    private String js_detail;
    private Date js_time;
    private Integer c_id;

    public Integer getJs_id() {
        return js_id;
    }

    public void setJs_id(Integer js_id) {
        this.js_id = js_id;
    }

    public String getJs_name() {
        return js_name;
    }

    public void setJs_name(String js_name) {
        this.js_name = js_name;
    }

    public String getJs_img() {
        return js_img;
    }

    public void setJs_img(String js_img) {
        this.js_img = js_img;
    }

    public String getJs_detail() {
        return js_detail;
    }

    public void setJs_detail(String js_detail) {
        this.js_detail = js_detail;
    }

    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    public Date getJs_time() {
        return js_time;
    }

    public void setJs_time(Date js_time) {
        this.js_time = js_time;
    }

    public Integer getC_id() {
        return c_id;
    }

    public void setC_id(Integer c_id) {
        this.c_id = c_id;
    }
}
