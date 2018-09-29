package com.fbq.springboot.Controller;

import com.fbq.springboot.mapper.StudentMapper;
import com.fbq.springboot.mapper.UserRepository;
import com.fbq.springboot.pojo.Student;
import com.fbq.springboot.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    StudentMapper mapper;

    @Autowired
    UserRepository userRepository;

    @RequestMapping("/listStudent")
    public String listStudent(Model model){
        List<Student> students = mapper.findAll();
        model.addAttribute("student",students);
        return "student";
    }

    @RequestMapping("/listStudentJpa")
    public String listStudentJpa(Model model){
        List<User> students = userRepository.findAllStudents();
        model.addAttribute("student",students);
        return "studentJpa";
    }

    @RequestMapping("/listStudentJpaById")
    public String listStudentJpaById(Model model){
//        User students = userRepository.findUserById(12);
        User students = userRepository.findUserByIdAsk(12);
        model.addAttribute("student",students);
        return "studentJpaById";
    }

}
