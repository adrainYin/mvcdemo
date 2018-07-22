package com.ych.dao;

import com.ych.unity.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentDao {

    public List<Student> getStudentList(){
        List<Student> list = new ArrayList<>();

        Student stu1 = new Student();
        stu1.setId(1);
        stu1.setName("Zhang San");
        list.add(stu1);

        Student stu2 = new Student();
        stu2.setId(2);
        stu2.setName("Li Si");
        list.add(stu2);

        return list;
    }
}
