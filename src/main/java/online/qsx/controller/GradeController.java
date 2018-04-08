package online.qsx.controller;

import online.qsx.model.Grade;
import online.qsx.server.GradeServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by 张罗平 on 2018/1/14.
 */
@Controller
@RequestMapping("grade")
public class GradeController {

    @Autowired
    private GradeServer gradeServer;


    /**
     *
     * @param grade
     * @param pageNum
     * @param mav
     * @return
     * http://localhost:8080/grade/list
     */
    @RequestMapping(value = "list",method = {RequestMethod.GET,RequestMethod.POST})
    public ModelAndView list(Grade grade, @RequestParam(defaultValue = "1") int pageNum,ModelAndView mav){

        mav.addObject("pageInfo",gradeServer.findListByObject(grade, pageNum));
        mav.addObject("pageNum",pageNum);
        mav.addObject("grade",grade);

        mav.setViewName("grade/list");
        return mav;
    }
}
