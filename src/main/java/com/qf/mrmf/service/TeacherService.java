package com.qf.mrmf.service;


import com.qf.mrmf.entity.TeacherDetail;

import java.util.Map;

public interface TeacherService {
    Map<String, Object> queryAll(int page);

    TeacherDetail selectById(int te_id);
}
