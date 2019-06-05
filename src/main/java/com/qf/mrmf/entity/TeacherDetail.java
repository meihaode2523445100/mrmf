package com.qf.mrmf.entity;

import lombok.Data;

import java.util.Date;

/**
 * @program: mrmf
 * @description: 名师风采实体类
 * @author: Tang_Siyuan
 * @create: 2019-06-05 21:04
 **/
@Data
public class TeacherDetail {
    private Integer dt_id;
    private String dt_title;
    private String dt_detail;
    private Date dt_time;
    private Integer te_id;

}
