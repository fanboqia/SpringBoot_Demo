package com.fbq.springboot.Controller;

import com.fbq.springboot.mapper.StudentMapper;
import com.fbq.springboot.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    StudentMapper mapper;

    @RequestMapping("/listStudent")
    public String listStudent(Model model){
        List<Student> students = mapper.findAll();
        model.addAttribute("student",students);
        return "student";
    }
}
