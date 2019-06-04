package com.qf.mrmf.service.impl;

import com.qf.mrmf.dao.CourseDao;
import com.qf.mrmf.entity.CourseType;
import com.qf.mrmf.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourserServiceImpl implements CourseService {

    @Autowired
    private CourseDao courseDao;

    @Override
    public List<CourseType> findAllCourseType() {
        return courseDao.findAllType();
    }
}
