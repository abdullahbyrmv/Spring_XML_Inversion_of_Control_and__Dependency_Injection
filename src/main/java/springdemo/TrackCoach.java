package springdemo;

public class TrackCoach implements Coach {

    // Define a private field for dependency
    private FortuneService fortuneService;

    // Define a constructor for dependency injection
    public TrackCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do It: " + fortuneService.getFortune();
    }

    // Add an init method
    public void doMyStartupStuff() {
        System.out.println("TrackCoach : Inside method doMyStartupStuff");
    }

    // Add a destroy method
    public void doMyCleanupStuff() {
        System.out.println("TrackCoach : Inside method doMyCleanupStuff");
    }
}
