package springdemo;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {
    public static void main(String[] args) {

        // Load spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeanLifeCycle-applicationContext.xml");

        // Retrieve bean from spring container
        Coach coach = context.getBean("myTrackCoach", Coach.class);

        // Call method
        System.out.println(coach.getDailyWorkout());

        // Close the context
        context.close();
    }
}
