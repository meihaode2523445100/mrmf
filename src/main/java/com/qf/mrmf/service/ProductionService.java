package com.qf.mrmf.service;

import com.qf.mrmf.vo.R;

public interface ProductionService {
    R queryAll();

    R findByPageOrId(int pr_type_id, int page);
}
