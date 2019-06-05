package com.qf.mrmf.service;

import com.qf.mrmf.vo.R;

import java.util.Map;

public interface ProductionService {
    R queryAll();

    Map<String, Object> findByPageOrId(int pr_type_id, int page);
}
