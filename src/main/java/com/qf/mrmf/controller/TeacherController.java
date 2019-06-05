package com.qf.mrmf.controller;

import com.qf.mrmf.service.TeacherService;
import com.qf.mrmf.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @program: mrmf
 * @description: 名师风采控制器
 * @author: Tang_Siyuan
 * @create: 2019-06-05 20:58
 **/
@Api(value = "teacher_show", tags = "teacher_show")
@RestController
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @ApiOperation(value = "展示所有名师", notes = "展示所有名师")
    @CrossOrigin
    @GetMapping("teacher/all.do")
    public R selectByPage(int page){
        Map<String, Object> map = teacherService.queryAll(page);
        return R.setOK("OK", map);

    }

    @ApiOperation(value = "根据id查看内容", notes = "根据id查看内容")
    @CrossOrigin
    @GetMapping(value = "teacher/search.do")
    public R selectById(int te_id){
        return R.setOK("OK", teacherService.selectById(te_id));
    }

}
