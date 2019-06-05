package com.qf.mrmf.service.impl;

import com.qf.mrmf.dao.JobDao;
import com.qf.mrmf.service.JobService;
import com.qf.mrmf.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobServiceImpl implements JobService {

    @Autowired
    private JobDao jobDao;
    @Override
    public R findJobMenu() {
        return R.setOK("ok", jobDao.showJobMenu());
    }

    @Override
    public R findJobCStar() {
        return R.setOK("ok", jobDao.showJobCStar());
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
