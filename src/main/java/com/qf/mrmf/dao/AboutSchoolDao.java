package com.qf.mrmf.dao;

import com.qf.mrmf.entity.AboutSchool;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AboutSchoolDao {

    public List<AboutSchool> showAboutSchoolMenu();
}
