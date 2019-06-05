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
}
