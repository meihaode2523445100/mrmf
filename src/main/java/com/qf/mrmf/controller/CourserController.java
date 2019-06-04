package com.qf.mrmf.controller;

import com.qf.mrmf.entity.CourseType;
import com.qf.mrmf.service.CourseService;
import com.qf.mrmf.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
public class CourserController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("/findCourseType.do")
    public JsonBean findAllCourserType(Model model){
        List<CourseType> type = courseService.findAllCourseType();
        return new JsonBean(1,type);
    }
}
