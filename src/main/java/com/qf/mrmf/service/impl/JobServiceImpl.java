package com.qf.mrmf.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qf.mrmf.dao.JobDao;
import com.qf.mrmf.entity.JobStar;
import com.qf.mrmf.service.JobService;
import com.qf.mrmf.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class JobServiceImpl implements JobService {

    @Autowired
    private JobDao jobDao;
    @Override
    public R findJobMenu() {
        return R.setOK("ok", jobDao.showJobMenu());
    }

    @Override
    public R findJobCStar(int page) {
        //参数一：页码   参数二：每页数据条数
        PageHelper.startPage(page, 3);
        List<JobStar> list =  jobDao.showJobCStar();
        Map<String, Object> map = new HashMap<>();

        map.put("total", ((Page)list).getTotal());

        map.put("rows", list);
        return R.setOK("ok", map);
    }

    @Override
    public R findJobJStar() {
        return R.setOK("ok", jobDao.showJobJStar());
    }

    @Override
    public R findJobJServer() {
        return R.setOK("ok", jobDao.showJobServer());
    }
}
