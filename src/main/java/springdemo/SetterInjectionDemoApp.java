package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionDemoApp {
    public static void main(String[] args) {

        // Load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve bean from spring container
        CricketCoach myCricketCoach = context.getBean("myCricketCoach",CricketCoach.class);

        //Call methods on the bean
        System.out.println(myCricketCoach.getDailyWorkout());
        System.out.println(myCricketCoach.getDailyFortune());
        System.out.println(myCricketCoach.getEmail());
        System.out.println(myCricketCoach.getName());

        // Close the context
        context.close();
    }
}
