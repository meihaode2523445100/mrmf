package com.qf.mrmf.entity;

/**
 * 课程的实体类
 */
public class Course {

    private int cid;
    private String cname;
    private String cimg;
    private int cprice;
    private String cdesc;
    private int ctypeid;
    private int crankid;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCimg() {
        return cimg;
    }

    public void setCimg(String cimg) {
        this.cimg = cimg;
    }

    public int getCprice() {
        return cprice;
    }

    public void setCprice(int cprice) {
        this.cprice = cprice;
    }

    public String getCdesc() {
        return cdesc;
    }

    public void setCdesc(String cdesc) {
        this.cdesc = cdesc;
    }

    public int getCtypeid() {
        return ctypeid;
    }

    public void setCtypeid(int ctypeid) {
        this.ctypeid = ctypeid;
    }

    public int getCrankid() {
        return crankid;
    }

    public void setCrankid(int crankid) {
        this.crankid = crankid;
    }
}
