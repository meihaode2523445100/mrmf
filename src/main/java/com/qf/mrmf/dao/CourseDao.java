package com.qf.mrmf.dao;

import com.qf.mrmf.entity.CourseType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface CourseDao {
    /**
     *  查询课程的所有的分类
     * @return
     */
    List<CourseType> findAllType();
}
