package com.qf.mrmf.entity;

import lombok.Data;

/**
 * @program: mrmf
 * @description: 名师实体类
 * @author: Tang_Siyuan
 * @create: 2019-06-05 20:43
 **/
@Data
public class Teacher {
    private Integer te_id;
    private String te_name;
    private String te_imgpath;
    private String te_detail;

}
