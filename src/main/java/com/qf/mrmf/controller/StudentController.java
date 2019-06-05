package com.qf.mrmf.controller;

import com.qf.mrmf.entity.Student;
import com.qf.mrmf.service.StudentService;
import com.qf.mrmf.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "学生报名",tags = "student apply")
public class StudentController {


    @Autowired
    private StudentService studentService;

    @CrossOrigin
    @RequestMapping(value = "studentApply.do",method = RequestMethod.POST)
    @ApiOperation(value = "学生报名", notes = "student：传入的参数为student")
    public R studentApply(Student student){
        return studentService.studentApply(student);
    }
}
