package com.qf.mrmf.dao;

import com.qf.mrmf.entity.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentDao {

    /**
     * 学生报名的方法，添加学生到数据库中
     * @param student
     * @return
     */
    int studentApply(Student student);

    /**
     * 查找学生是否已经报名
     * @param sname
     * @param stel
     * @param cid
     * @return
     */
    Student findStudent(String sname, String stel, int cid);
}
