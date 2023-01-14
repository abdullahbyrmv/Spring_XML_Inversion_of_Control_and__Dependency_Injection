package springdemo;

public class BaseballCoach implements Coach {

    // Define a private field for dependency
    private FortuneService fortuneService;

    // Define a constructor for dependency injection
    public BaseballCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {

        // Use my FortuneService to get a fortune
        return fortuneService.getFortune();
    }
}
