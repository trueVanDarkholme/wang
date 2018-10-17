import com.controller.TestController;
import com.service.TestService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

public class ApplicationTest {
    public  static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("springMVC-main.xml");
        TestService tc = (TestService) ctx.getBean("testService");
        tc.toTest2();
        System.out.println(23333);
    }
}
