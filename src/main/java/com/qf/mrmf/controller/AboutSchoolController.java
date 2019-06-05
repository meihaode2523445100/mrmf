package com.qf.mrmf.controller;


import com.qf.mrmf.service.AboutSchoolService;
import com.qf.mrmf.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "学校概况",tags = "about_school")
public class AboutSchoolController {

    @Autowired
    private AboutSchoolService aboutSchoolService;

    @ApiOperation(value = "查到菜单项", notes = "查询")
    @RequestMapping(value = "aboutSchool",method = RequestMethod.GET)
    public R findAboutSchool() {
        return aboutSchoolService.showAboutSchool();
    }


    @ApiOperation(value = "查到学校简介", notes = "查询")
    @RequestMapping(value = "schoolProfile",method = RequestMethod.GET)
    public R findSchoolProfile() {
        return aboutSchoolService.showSchoolProfile();
    }

    @ApiOperation(value = "查到校长致辞", notes = "查询")
    @RequestMapping(value = "schoolMaster",method = RequestMethod.GET)
    public R findSchoolMaster() {
        return aboutSchoolService.showSchoolMaster();
    }

    @ApiOperation(value = "查到教学环境", notes = "查询")
    @RequestMapping(value = "schoolEnvir",method = RequestMethod.GET)
    public R findSchoolEnvir() {
        return aboutSchoolService.showSchoolEnvir();
    }
    @ApiOperation(value = "查到学校荣誉", notes = "查询")
    @RequestMapping(value = "schoolHonor",method = RequestMethod.GET)
    public R findSchoolHonor() {
        return aboutSchoolService.showSchoolHonor();
    }
    @ApiOperation(value = "查到学校快讯", notes = "查询")
    @RequestMapping(value = "schoolNews",method = RequestMethod.GET)
    public R findSchoolNews() {
        return aboutSchoolService.showSchoolNews();
    }



}
