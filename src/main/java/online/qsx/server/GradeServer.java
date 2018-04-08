package online.qsx.server;

import com.github.pagehelper.PageInfo;
import online.qsx.model.Grade;

/**
 * Created by 张罗平 on 2018/1/13.
 */
public interface GradeServer {
    Grade findGradeById(Integer gradeid);

    PageInfo<Grade> findListByObject(Grade grade,int pageNum);
}
