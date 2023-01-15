package springdemo;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {

        // Load spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeanScope-applicationContext.xml");

        // Retrieve bean from spring container
        Coach coach = context.getBean("myTrackCoach", Coach.class);
        Coach coach2 = context.getBean("myTrackCoach", Coach.class);

        // Check if they are pointing to the same object
        boolean result = (coach == coach2);

        System.out.println("Pointing to the same object : " + result);

        System.out.println("Memory location for coach : " + coach);

        System.out.println("Memory location for coach2 : " + coach2);

        // Close the context
        context.close();
    }
}
