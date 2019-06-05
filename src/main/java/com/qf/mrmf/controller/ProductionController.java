package com.qf.mrmf.controller;

import com.qf.mrmf.service.ProductionService;
import com.qf.mrmf.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @program: mrmf
 * @description: 作品展示控制器
 * @author: Tang_Siyuan
 * @create: 2019-06-04 17:40
 **/
@Api(value = "works_show", tags = "works_show")
// @Controller
@RestController
public class ProductionController {
    @Autowired
    private ProductionService productionService;

    // 全部作品展示分类
    @CrossOrigin
    @ApiOperation(value = "查询全部作品展示分类", notes = "查询全部作品展示分类")
    @GetMapping("productionType/all.do")
    //@RequestMapping(value = "production/all.do", method = RequestMethod.GET)
    // @ResponseBody
    public R all(){
        return productionService.queryAll();
    }

    @CrossOrigin
    @ApiOperation(value = "根据id查看所属内容", notes = "根据id查看所属内容")
    @GetMapping("production/search.do")
    public R selectByPageOrId(int pr_type_id, int page){
        Map<String, Object> map = productionService.findByPageOrId(pr_type_id, page);
        return R.setOK("OK", map);
    }

}
















