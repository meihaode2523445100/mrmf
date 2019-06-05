package com.qf.mrmf.dao;

import com.qf.mrmf.entity.Job;
import com.qf.mrmf.entity.JobJServer;
import com.qf.mrmf.entity.JobStar;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface JobDao {

    List<Job> showJobMenu();
    List<JobStar> showJobCStar();
    List<JobStar> showJobJStar();
    List<JobJServer> showJobServer();

}
