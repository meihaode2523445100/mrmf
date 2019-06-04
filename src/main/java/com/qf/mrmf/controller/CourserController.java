package com.qf.mrmf.controller;

import com.qf.mrmf.service.CourseService;
import com.qf.mrmf.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Api(value = "课程", tags = "course")
public class CourserController {

    @Autowired
    private CourseService courseService;

    @RequestMapping(value = "findCourseType.do",method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
    @ApiOperation(value = "查找课程的分类", notes = "无参")
    public R findAllCourserType(){
        return courseService.findAllCourseType();
    }
}
