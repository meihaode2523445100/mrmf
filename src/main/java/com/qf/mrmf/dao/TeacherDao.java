package com.qf.mrmf.dao;

import com.qf.mrmf.entity.Teacher;
import com.qf.mrmf.entity.TeacherDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @program: mrmf
 * @description: 名师风采方法
 * @author: Tang_Siyuan
 * @create: 2019-06-05 20:47
 **/
@Mapper
public interface TeacherDao {

    List<Teacher> queryAll();

    TeacherDetail selectById(int te_id);
}
