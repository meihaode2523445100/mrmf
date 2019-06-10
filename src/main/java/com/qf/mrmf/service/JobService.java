package com.qf.mrmf.service;

import com.qf.mrmf.vo.R;

public interface JobService {
    R findJobMenu();

    R findJobCStar(int page);

    R findJobJStar();
    R findJobJServer();

}
