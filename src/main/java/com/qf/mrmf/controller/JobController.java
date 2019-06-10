package com.qf.mrmf.controller;

import com.qf.mrmf.service.JobService;
import com.qf.mrmf.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "就业服务", tags = "job")
public class JobController {

    @Autowired
    private JobService jobService;

    @RequestMapping(value = "job", method = RequestMethod.GET)
    @ApiOperation(value = "查到就业服务菜单", notes = "查询")
    public R findJobMenu() {
        return jobService.findJobMenu();
    }
    @RequestMapping(value = "CStar", method = RequestMethod.GET)
    @ApiOperation(value = "查到创业之星", notes = "查询")
    public R findJobCStar(int page) {
        return jobService.findJobCStar(page);
    }
    @RequestMapping(value = "JStar", method = RequestMethod.GET)
    @ApiOperation(value = "查到就业之星", notes = "查询")
    public R findJStar() {
        return jobService.findJobJStar();
    }
    @RequestMapping(value = "jobServer", method = RequestMethod.GET)
    @ApiOperation(value = "查到就业服务信息", notes = "查询")
    public R findJobJServer() {
        return jobService.findJobJServer();
    }


}
