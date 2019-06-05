package com.qf.mrmf.service.impl;

import com.qf.mrmf.dao.CampusDao;
import com.qf.mrmf.service.CampusService;
import com.qf.mrmf.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CampusServiceImpl implements CampusService {
    @Autowired
    private CampusDao campusDao;

    @Override
    public R findAllCampus() {
       /* List<Campus> campus = campusDao.findCampus();*/
        return R.setOK("OK", campusDao.findCampus());
    }
}
