package controller;

import dao.studentDao;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class StudentController {
    HashMap hashMap = (HashMap) studentDao.Initialization();

    @RequestMapping("/selectstudent")
    public ModelAndView selectstudent() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("student");
        modelAndView.addObject("list", hashMap);
        return modelAndView;
    }

}
