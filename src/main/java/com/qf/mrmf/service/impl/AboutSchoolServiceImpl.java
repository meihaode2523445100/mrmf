package com.qf.mrmf.service.impl;

import com.qf.mrmf.dao.AboutSchoolDao;
import com.qf.mrmf.entity.AboutSchool;
import com.qf.mrmf.service.AboutSchoolService;
import com.qf.mrmf.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AboutSchoolServiceImpl implements AboutSchoolService {
    @Autowired
    private AboutSchoolDao aboutSchoolDao;

    @Override
    public R showAboutSchool() {
        return R.setOK("ok", aboutSchoolDao.showAboutSchoolMenu());
    }

    @Override
    public R showSchoolProfile() {
        return R.setOK("ok", aboutSchoolDao.showSchoolProfile());
    }

    @Override
    public R showSchoolMaster() {
        return R.setOK("ok", aboutSchoolDao.showSchoolMaster());
    }

    @Override
    public R showSchoolEnvir() {
        return R.setOK("ok", aboutSchoolDao.showSchoolEnvir());
    }
    @Override
    public R showSchoolHonor() {
        return R.setOK("ok", aboutSchoolDao.showSchoolHonor());
    }
    @Override
    public R showSchoolNews() {
        return R.setOK("ok", aboutSchoolDao.showSchoolNews());
    }
}
