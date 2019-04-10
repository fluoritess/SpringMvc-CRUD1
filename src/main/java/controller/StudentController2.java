package controller;

import dao.studentDao;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import po.student;

import java.util.HashMap;
import java.util.Map;

@Controller
public class StudentController2 {

    @RequestMapping("/selectonestudent")
    public ModelAndView selectonestudent(String number ){
        String number_1=number;
        student student=studentDao.getstudetnt(number_1);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("studentper");
        modelAndView.addObject("student",student);
        return modelAndView;
    }
    @RequestMapping("updatestudent")
    public ModelAndView updatestudent(String number,String name,String sex,String address ){
        String number_1=number;
        String name_1=name;
        String sex_1=sex;
        String address_1=address;
        student student=new student(name,number,sex,address);
        studentDao.deletestudent(number_1);
        studentDao.addstudent(student);
        Map studentlist=studentDao.getStudentList();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("student");
        modelAndView.addObject("list",studentlist);
        return modelAndView;
    }
    @RequestMapping("/deletestudent")
    public ModelAndView deletestudent(String number ){
        studentDao.deletestudent(number);
        ModelAndView modelAndView = new ModelAndView();
        Map studentlist=studentDao.getStudentList();
        modelAndView.setViewName("student");
        modelAndView.addObject("list",studentlist);
        return modelAndView;
    }
    @RequestMapping("addstudent")
    public ModelAndView addstudent(String number,String name,String sex,String address ){
        String number_1=number;
        String name_1=name;
        String sex_1=sex;
        String address_1=address;
        student student=new student(name,number,sex,address);
        studentDao.addstudent(student);
        Map studentlist=studentDao.getStudentList();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("student");
        modelAndView.addObject("list",studentlist);
        return modelAndView;
    }
}
