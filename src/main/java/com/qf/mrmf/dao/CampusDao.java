package com.qf.mrmf.dao;

import com.qf.mrmf.entity.Campus;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface CampusDao {
    /* 查找所以的校区 */
    List<Campus> findCampus();
}
