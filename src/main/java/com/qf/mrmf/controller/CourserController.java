package com.qf.mrmf.controller;

import com.qf.mrmf.service.CourseService;
import com.qf.mrmf.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "课程", tags = "course")
public class CourserController {

    @Autowired
    private CourseService courseService;
    @CrossOrigin
    @RequestMapping(value = "findCourseType.do",method = RequestMethod.GET)
    @ApiOperation(value = "查找课程的分类", notes = "无参")
    public R findAllCourserType(){
        return courseService.findAllCourseType();
    }

    @CrossOrigin
    @RequestMapping(value = "findCourseRank.do",method = RequestMethod.GET)
    @ApiOperation(value = "查找课程的等级", notes = "无参")
    public R findAllRank(){
        return courseService.findAllCourseRank();
    }

    @CrossOrigin
    @RequestMapping(value = "findCourse.do",method = RequestMethod.GET)
    @ApiOperation(value = "查找相关的课程" ,notes="ctypeid:课程的种类id；crankid：课程等级的id; page:查询的页数;limit:查询的条数")
    public R findCourse(int ctypeid,int crankid,int page,int limit){
        return courseService.findCourserBySomeCondition(ctypeid,crankid,page,limit);
    }

}
