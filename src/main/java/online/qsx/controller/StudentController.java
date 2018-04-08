package online.qsx.controller;

import com.alibaba.fastjson.JSONObject;
import online.qsx.model.Grade;
import online.qsx.model.Student;
import online.qsx.server.GradeServer;
import online.qsx.server.StudentServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by 张罗平 on 2018/1/13.
 */
@Controller
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentServer studentServer;

    @Autowired
    private GradeServer gradeServer;
    /**
     *
     * @param student
     * @param pageNum
     * @param mav
     * @return
     *
     * http://localhost:8080/student/list
     */
    @RequestMapping(value = "list",method = {RequestMethod.GET,RequestMethod.POST})
    public ModelAndView list(Student student, @RequestParam(defaultValue = "1")int pageNum,ModelAndView mav){

        mav.addObject("pageInfo",studentServer.findListByObject(student,pageNum));
        mav.addObject("pageNum",pageNum);
        mav.addObject("student",student);
        mav.setViewName("student/list");
        return mav;
    }

    @PostMapping(value = "findGrade",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String findGrade(Integer studentno){

        Student student = studentServer.findStudentById(studentno);

        Grade grade = gradeServer.findGradeById(student.getGradeid());


        JSONObject json = new JSONObject();
        json.put("gradeid",grade.getGradeid());
        json.put("gradename",grade.getGradename());
        return json.toString();
    }

    /**
     *
     * @param studentno
     * @return
     * http://localhost:8080/student/remove
     */
    @RequestMapping(value = "remove",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public String remove(Integer studentno){

      Student student=studentServer.findStudentById(studentno);

        studentServer.remove(studentno);

        JSONObject json = new JSONObject();
        json.put("studentno",student.getStudentno());
        json.put("studentname",student.getStudentname());
        json.put("loginpwd",student.getLoginpwd());
        json.put("sex",student.getSex());
        json.put("gradeid",student.getGradeid());
        json.put("phone",student.getPhone());
        json.put("address",student.getAddress());
        json.put("borndate",student.getBorndate());
        json.put("email",student.getEmail());
        json.put("identitycard",student.getIdentitycard());

        return json.toString();
    }
}
