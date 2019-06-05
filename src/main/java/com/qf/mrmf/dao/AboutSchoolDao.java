package com.qf.mrmf.dao;

import com.qf.mrmf.entity.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AboutSchoolDao {

    public List<AboutSchool> showAboutSchoolMenu();

    public List<SchoolProfile> showSchoolProfile();
    public List<SchoolMaster> showSchoolMaster();
    public List<SchoolEnvir> showSchoolEnvir();
    public List<SchoolHonor> showSchoolHonor();
    public List<SchoolNews> showSchoolNews();
}
