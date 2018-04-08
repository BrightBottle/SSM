package online.qsx.server.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import online.qsx.mapper.GradeMapper;
import online.qsx.model.Grade;
import online.qsx.model.GradeCriteria;
import online.qsx.server.GradeServer;
import online.qsx.utile.PageUtile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Created by 张罗平 on 2018/1/13.
 */
@Service
public class GradeServerImpl implements GradeServer{

    @Autowired
    private GradeMapper gradeMapper;

    @Override
    public Grade findGradeById(Integer gradeid) {
        return gradeMapper.selectByPrimaryKey(gradeid);
    }

    @Override
    public PageInfo<Grade> findListByObject(Grade grade, int pageNum) {

        GradeCriteria gradeCriteria = new GradeCriteria();


        PageHelper.startPage(pageNum, PageUtile.PAGE_SIZE);
        List<Grade> grades = gradeMapper.selectByExample(gradeCriteria);

        return new PageInfo<>(grades);
    }
}
