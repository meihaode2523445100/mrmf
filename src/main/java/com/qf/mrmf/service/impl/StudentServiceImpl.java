package com.qf.mrmf.service.impl;

import com.qf.mrmf.dao.StudentDao;
import com.qf.mrmf.entity.Student;
import com.qf.mrmf.service.StudentService;
import com.qf.mrmf.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;
    @Override
    public R studentApply(Student student) {
        // 判断该生是否报名
        Student findstudent = studentDao.findStudent(student.getSname(), student.getStel(), student.getCid());

        if (findstudent == null) {
            studentDao.studentApply(student);
            return R.setOK("success",null);
        } else {
            return R.setERROR();
        }
    }
}
