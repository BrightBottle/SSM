package online.qsx.server.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import online.qsx.mapper.StudentMapper;
import online.qsx.model.Student;
import online.qsx.model.StudentCriteria;
import online.qsx.server.StudentServer;
import online.qsx.utile.PageUtile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 张罗平 on 2018/1/13.
 */
@Service
public class StudentServerImpl implements StudentServer {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public PageInfo<Student> findListByObject(Student student, int pageNum) {

        StudentCriteria studentCriteria = new StudentCriteria();

        if (student != null) {
            StudentCriteria.Criteria criteria = studentCriteria.createCriteria();


            if (student.getStudentname() != null && student.getStudentname().trim().length() > 0) {
                criteria.andStudentnameLike("%" + student.getStudentname().trim() + "%");
            }

            if (student.getIdentitycard() != null && student.getIdentitycard().trim().length() > 0) {
                criteria.andIdentitycardLike("%" + student.getIdentitycard() + "%");
            }

            if (student.getAddress() != null && student.getAddress().trim().length() > 0) {
                criteria.andAddressLike("%" + student.getAddress() + "%");
            }
            if (student.getStudentno() != null && student.getStudentno() > 0) {
                criteria.andStudentnoEqualTo(student.getStudentno());
            }

        }
        PageHelper.startPage(pageNum, PageUtile.PAGE_SIZE);
        List<Student> students = studentMapper.selectByExample(studentCriteria);
        PageInfo<Student> studentPageInfo = new PageInfo<>(students);

        System.out.println(studentPageInfo.getList());
        return studentPageInfo;
    }

    @Override
    public Student findStudentById(Integer studentno) {
        return studentMapper.selectByPrimaryKey(studentno);
    }

    @Override
    public void remove(Integer studentno) {
           studentMapper.deleteByPrimaryKey(studentno);
           System.out.println(studentno);
        }
    }


