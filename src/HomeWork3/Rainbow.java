package HomeWork3;

import java.util.Scanner;

public class Rainbow {
    static Scanner scan = new Scanner(System.in);
    private static final int NUMBER = scan.nextInt();

    public String getColor() {
        switch (NUMBER) {
            case 1:
                String str = "Red";
                return str;
            case 2:
                String str1 = "Orange";
                return str1;
            case 3:
                String str2 = "Yellow";
                return str2;
            case 4:
                String str3 = "Green";
                return str3;
            case 5:
                String str4 = "Cyan";
                return str4;
            case 6:
                String str5 = "Blue";
                return str5;
            case 7:
                String str6 = "Violet";
                return str6;
            default:
                System.out.println("Number is not corrected, please enter corrected number");
        }
        String str = "";
        return str;
    }

    public String getTwoColor() {
        int NUMBER2 = scan.nextInt();
        if (NUMBER2 == 1) {
            String str = getColor() + "-Red";
            return str;
        } else if (NUMBER2 == 2) {
            String str = getColor() + "-Orange";
            return str;
        } else if (NUMBER2 == 3) {
            String str = getColor() + "-Yellow";
            return str;
        } else if (NUMBER2 == 4) {
            String str = getColor() + "-Green";
            return str;
        } else if (NUMBER2 == 5) {
            String str = getColor() + "-Cyan";
            return str;
        } else if (NUMBER2 == 6) {
            String str = getColor() + "-Blue";
            return str;
        } else if (NUMBER2 == 7) {
            String str = getColor() + "-Violet";
            return str;
        } else if (NUMBER2 >= 8) {
            System.out.println("Number is not corrected, please enter corrected number");
        }
        String str = "";
        return str;
    }
}