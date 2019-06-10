package com.qf.mrmf.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qf.mrmf.dao.ProductionDao;
import com.qf.mrmf.entity.Production;
import com.qf.mrmf.service.ProductionService;
import com.qf.mrmf.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: mrmf
 * @description: 作品展示分类
 * @author: Tang_Siyuan
 * @create: 2019-06-04 17:37
 **/
@Service
public class ProductionServiceImpl implements ProductionService {
    @Autowired
    private ProductionDao productionTypeDao;

    @Override
    public R queryAll() {
        return R.setOK("OK", productionTypeDao.queryAll());
    }

    @Override
    public R findByPageOrId(int pr_type_id, int page) {
        PageHelper.startPage(page, 4);
        List<Production> list = productionTypeDao.selectById(pr_type_id);

        Map<String, Object> map = new HashMap<>();
        // 获取总记录数
        map.put("total",((Page)list).getTotal());
        // 当前页显示的记录
        map.put("rows", list);
        return R.setOK("分页查询",map);
    }
}
