package com.qf.mrmf.dao;

import com.qf.mrmf.entity.Production;
import com.qf.mrmf.entity.ProductionType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @program: mrmf
 * @description: 作品展示分类方法
 * @author: Tang_Siyuan
 * @create: 2019-06-04 17:32
 **/
@Mapper
public interface ProductionDao {

    /**
     * 查询作品展示的分类
     * @return
     */
    List<ProductionType> queryAll();

    /**
     * 根据pr_type_id展示所属作品
     * @param pr_type_id
     * @return
     */
    List<Production> selectById(int pr_type_id);
}














