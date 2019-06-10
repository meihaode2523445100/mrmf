package com.qf.mrmf.service;

import com.qf.mrmf.vo.R;

public interface CourseService {

    R findAllCourseType();

    R findAllCourseRank();

    R findCourserBySomeCondition(int ctypeid,int crankid,int page);

    R findAll();

}
