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
        stu1.setFirstName("jerry");
        stu1.setLastName("hello");
        stu1.setUsername("mike");
        stu1.setPassword("123000");
        list.add(stu1);

        Student stu2 = new Student();
        stu2.setFirstName("adrain");
        stu2.setLastName("hao");
        stu2.setUsername("yinchenhao");
        stu2.setPassword("123456");
        list.add(stu2);

        return list;
    }
}
