package com.qf.mrmf.entity;

import lombok.Data;

import java.util.Date;

/**
 * @program: mrmf
 * @description: 作品实体类
 * @author: Tang_Siyuan
 * @create: 2019-06-05 18:08
 **/
@Data
public class Production {

    private Integer dp_id;
    private String dp_title;
    private Date dp_time;
    private String dp_imgpath;
    private Integer pr_type_id;

}
