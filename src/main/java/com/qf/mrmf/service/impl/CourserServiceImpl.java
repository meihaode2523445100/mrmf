package com.qf.mrmf.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qf.mrmf.dao.CourseDao;
import com.qf.mrmf.entity.Course;
import com.qf.mrmf.service.CourseService;
import com.qf.mrmf.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public R findCourserBySomeCondition(int ctypeid, int crankid, int page) {
        PageHelper.startPage(page, 3);

        List<Course> list = courseDao.findCourserBySomeCondition(ctypeid, crankid);

        Map<String, Object> map = new HashMap<>();

        //获取总记录数
        map.put("total", ((Page)list).getTotal());
        //当前页显示的记录
        map.put("rows", list);
        return R.setOK("分页查询",map);
    }

    @Override
    public R findAll() {
        List<Course> allCourse = courseDao.findAllCourse();
        return R.setOK("OK",allCourse);

    }

/*   @Override
    public R findCourseBypage(int page) {
        PageHelper.startPage(page, 5);
        List<Course> allCourse = courseDao.findAllCourse();
        Map<String, Object> map = new HashMap<>();
        //获取总记录数
        map.put("total", ((Page)allCourse).getTotal());
        //当前页显示的记录
        map.put("rows", allCourse);
        return R.setOK("分页查询",map);
    }*/

}
