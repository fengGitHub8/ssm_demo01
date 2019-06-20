import com.feng.entity.Emp;
import com.feng.service.EmpService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @program: ssm
 * @description:
 * @author: FengYang
 * @create: 2019-06-19 22:48
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class Demo {
    @Autowired
    private EmpService empService;
    @Test
    public void test(){
        List<Emp> allUser = empService.getAllEmp();
        System.out.println(allUser);
    }
}
