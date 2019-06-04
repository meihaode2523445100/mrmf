package com.qf.mrmf.service.impl;

import com.qf.mrmf.dao.CourseDao;
import com.qf.mrmf.service.CourseService;
import com.qf.mrmf.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourserServiceImpl implements CourseService {

    @Autowired
    private CourseDao courseDao;

    @Override
    public R findAllCourseType() {
        return R.setOK("OK",courseDao.findAllType());
    }
}
