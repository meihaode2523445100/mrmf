package com.qf.mrmf.service.impl;

import com.qf.mrmf.dao.CourseDao;
import com.qf.mrmf.entity.Course;
import com.qf.mrmf.service.CourseService;
import com.qf.mrmf.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourserServiceImpl implements CourseService {

    @Autowired
    private CourseDao courseDao;

    @Override
    public R findAllCourseType() {
        return R.setOK("OK",courseDao.findAllType());
    }

    @Override
    public R findAllCourseRank() {
        return R.setOK("OK",courseDao.findAllRank());
    }

    @Override
    public R findCourserBySomeCondition(int ctypeid, int crankid, int page, int limit) {
        int index = ( page - 1 ) * limit ;

        List<Course> course = courseDao.findCourserBySomeCondition(ctypeid, crankid, index, limit);

        return R.setOK("OK",course);
    }

}
