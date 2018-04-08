package online.qsx.server;

import com.github.pagehelper.PageInfo;
import online.qsx.model.Student;

/**
 * Created by 张罗平 on 2018/1/13.
 */
public interface StudentServer {

    PageInfo<Student> findListByObject(Student student,int pageNum);

    Student findStudentById(Integer studentno);

    void remove(Integer studentno);
}
