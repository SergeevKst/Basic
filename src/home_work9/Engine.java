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

        screen("Write radius (mm) : ");
        radius = getScanner();

        screen("Write height (mm) : ");
        height = getScanner();

        if (radius > 960 || radius < 70) getUncorrectedRadius();
        else if (height > 2500 || height < 100) getUncorrectedHeight();
        else getVolume();
    }

    private static int getScanner() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private void getVolume() {
        volume = (int) ((Math.PI * radius * radius * height) / 1000);
        screen("Volume: " + volume + " cm^3.");
    }

    private void getUncorrectedHeight() {
        try {
            throw new UncorrectedHeightException(EXCEPTION_HEIGHT);
        } catch (UncorrectedHeightException e) {
            System.err.println(e.getMessage());
        } finally {
            screen(TEXT_END);
        }
    }

    private void getUncorrectedRadius() {
        try {
            throw new UncorrectedRadiusException(EXCEPTION_RADIUS);
        } catch (UncorrectedRadiusException e) {
            System.err.println(e.getMessage());
        } finally {
            screen(TEXT_END);
        }
    }

    private void screen(String info) {
        System.out.println(info);
    }
}
