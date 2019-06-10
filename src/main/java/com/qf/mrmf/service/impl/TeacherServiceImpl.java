package com.qf.mrmf.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qf.mrmf.dao.TeacherDao;
import com.qf.mrmf.entity.Teacher;
import com.qf.mrmf.entity.TeacherDetail;
import com.qf.mrmf.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: mrmf
 * @author: Tang_Siyuan
 * @create: 2019-06-05 20:54
 **/
@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherDao teacherDao;

    @Override
    public Map<String, Object> queryAll(int page) {
        PageHelper.startPage(page, 6);
        List<Teacher> list = teacherDao.queryAll();

        Map<String, Object> map = new HashMap<>();
        map.put("total", ((Page)list).getTotal());
        map.put("rows", list);
        return map;
    }

    @Override
    public TeacherDetail selectById(int te_id) {
        return  teacherDao.selectById(te_id);

    }
}
