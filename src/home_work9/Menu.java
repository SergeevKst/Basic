package home_work9;

public class Menu {
    public static void start() {

        User user = new User();

        try {
            user.setAge();
        } catch (UncorrectedAgeException e) {
            System.err.println(e.getMessage());
        } finally {
            user.screen("Try again");
        }

        Engine engine = new Engine();

        engine.setVolume();
    }
}
