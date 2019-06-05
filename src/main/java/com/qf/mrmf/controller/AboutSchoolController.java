package com.qf.mrmf.controller;


import com.qf.mrmf.entity.AboutSchool;
import com.qf.mrmf.service.AboutSchoolService;
import com.qf.mrmf.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Api(value = "关于学校",tags = "about_school")
@Controller
public class AboutSchoolController {

    @Autowired
    private AboutSchoolService aboutSchoolService;


    @ApiOperation(value = "查到菜单项", notes = "查询")
    @RequestMapping(value = "aboutSchool",method = RequestMethod.GET)
    @ResponseBody
    public R findAboutSchool() {
        return aboutSchoolService.showAboutSchool();
    }

}
