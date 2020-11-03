package cybertek.services;

import cybertek.interfaces.Course;
import cybertek.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class Java implements Course {

    @Value("JD1")
    private String batch;

    @Value("${instructor}")
    private String instructor;

    private String[] days;

    @Override
    public String toString(){
        return "Java{"+ "batch='"+ batch + '\'' + ", days=" + Arrays.toString(days)+ '}';
    }













    //field injection
    //@Autowired
    //@Qualifier("officeHours")
    private ExtraSessions extraSessions;

    //constructor injection
    public Java(@Qualifier("officeHours") ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours for Java is "+ (20+ extraSessions.getHours()));

    }
}
