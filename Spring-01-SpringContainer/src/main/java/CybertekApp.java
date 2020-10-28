import com.cybertek.interfaces.Mentor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CybertekApp {
    public static void main(String[] args) {

        //BeanFactory container = new ClassPathXmlApplicationContext("config.xml");

        //polymorphic way
        //Mentor mentor = new FullTimeMentor();

        //spring way
        //Mentor mentor = (Mentor)container.getBean("fullTimeMentor");
        //mentor.createAccount();


        //2nd way of creating container- Application context
        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");
        Mentor mentor1 = (Mentor)container.getBean("partTimeMentor");
        mentor1.createAccount();

        //3rd way of creating container, returning whatever you need from obj
        Mentor mentor = container.getBean("fullTimeMentor", Mentor.class);
        mentor.createAccount();


    }
}
