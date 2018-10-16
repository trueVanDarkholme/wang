import com.service.TestService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationTest {
    public  static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("springMVC-main.xml");
        TestService ts = (TestService) ctx.getBean("testService");
        System.out.println(ts);
    }
}
