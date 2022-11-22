package home_work9;

import java.util.Scanner;

public class User {

    private static final String CORRECTED_AGE = "Corrected age";
    private static final String UNCORRECTED_AGE = "Uncorrected age";
    private int age;

    public void setAge() throws UncorrectedAgeException {

        screen("Write your age: ");

        Scanner scanner = new Scanner(System.in);
        age = scanner.nextInt();

        if (age > 119 || age < 1) getUncorrectedAge();

        screen(CORRECTED_AGE);
    }

    private static void getUncorrectedAge() throws UncorrectedAgeException {
        throw new UncorrectedAgeException(UNCORRECTED_AGE);
    }

    public void screen(String info) {
        System.out.println(info);
    }
}
