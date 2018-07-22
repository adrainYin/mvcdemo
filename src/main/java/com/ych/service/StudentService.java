package com.ych.service;

import com.ych.dao.StudentDao;
import com.ych.unity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//该注解其实也是一个组件扫描注解
@Service
public class StudentService {

    @Autowired
    StudentDao studentDao;

    public List<Student> getStudentList(){
        return studentDao.getStudentList();
    }
}
