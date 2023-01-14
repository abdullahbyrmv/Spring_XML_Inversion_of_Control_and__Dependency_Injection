package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {

        //load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve bean from spring container
        Coach myTrackCoach = context.getBean("myTrackCoach", Coach.class);

        Coach myBaseballCoach = context.getBean("myBaseballCoach", Coach.class);

        //Call methods on the bean
        System.out.println(myTrackCoach.getDailyWorkout());

        System.out.println(myTrackCoach.getDailyFortune());

        System.out.println(myBaseballCoach.getDailyWorkout());

        System.out.println(myBaseballCoach.getDailyFortune());

        // Close the Context
        context.close();
    }
}
