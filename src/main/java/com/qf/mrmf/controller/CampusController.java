package com.qf.mrmf.controller;

import com.qf.mrmf.service.CampusService;
import com.qf.mrmf.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "校区" ,tags = "campus")
public class CampusController {
    @Autowired
    private CampusService campusService;

    @CrossOrigin
    @RequestMapping(value = "findAllCampus.do", method = RequestMethod.GET)
    @ApiOperation(value = "查找学校所有分校", notes = "无参")
    public R findAllCampus(){
        return campusService.findAllCampus();
    }
}
