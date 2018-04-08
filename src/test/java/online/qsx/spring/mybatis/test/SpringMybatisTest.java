package online.qsx.spring.mybatis.test;


import online.qsx.mapper.StudentMapper;
import online.qsx.model.Student;
import online.qsx.model.StudentCriteria;
import online.qsx.server.StudentServer;
import online.qsx.server.impl.StudentServerImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by 张罗平 on 2018/1/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath:ApplicationContext-*.xml"})
public class SpringMybatisTest {

    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private StudentServer studentServer;
    @Test
    public void findListTest(){

       List<Student> students=studentServer.findListByObject(null,1).getList();

      students.stream().forEach(student -> System.out.println(student));

    }
}

