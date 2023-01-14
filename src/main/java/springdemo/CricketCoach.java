package springdemo;

public class CricketCoach implements Coach {

    // Define private field for dependency
    private FortuneService fortuneService;
    private String email;
    private String name;

    public CricketCoach() {
        System.out.println("Inside CricketCoach no-arg Constructor");
    }

    // Setter method for dependency injection
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Inside of CricketCoach setter method : setFortuneService");
        this.fortuneService = fortuneService;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        System.out.println("Inside of CricketCoach setter method : setEmail");
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Inside of CricketCoach setter method : setName");
        this.name = name;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
