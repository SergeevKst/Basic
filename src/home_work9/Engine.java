package home_work9;

import java.util.Scanner;

public class Engine {
    private static final String EXCEPTION_RADIUS = "Uncorrected radius";

    private static final String EXCEPTION_HEIGHT = "Uncorrected height";

    private static final String TEXT_END = "Try again";

    private int volume;

    private int height;

    private int radius;

    public void setVolume() {

        screen("Calculation of engine volume");

        getRadius();

        getHeight();

        getVolume();
    }

    private static int getScanner() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private void getVolume() {
        volume = (int) ((Math.PI * radius * radius * height) / 1000);
        screen("Volume: " + volume + " cm^3.");
    }

    private void getHeight() {

        screen("Write height (mm) : ");

        try {
            height = getScanner();
            if (height > 2500 || height < 100) throw new UncorrectedHeightException(EXCEPTION_HEIGHT);
        } catch (UncorrectedHeightException e) {
            System.err.println(e.getMessage());
        } finally {
            if (height > 2500 || height < 100) screen(TEXT_END);
        }
    }

    private void getRadius() {

        screen("Write radius (mm) : ");

        try {
            radius = getScanner();
            if (radius > 960 || radius < 70) throw new UncorrectedRadiusException(EXCEPTION_RADIUS);
        } catch (UncorrectedRadiusException e) {
            System.err.println(e.getMessage());
        } finally {
            if (radius > 960 || radius < 70) screen(TEXT_END);
        }
    }

    private void screen(String info) {
        System.out.println(info);
    }
}
