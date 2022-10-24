package HomeWork3;

import java.util.Scanner;

public class Rainbow {
    static Scanner scan = new Scanner(System.in);
    public String getColor() {
        int number1 = scan.nextInt();
        switch (number1) {
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
                String str7="Number is not corrected, please enter corrected number";
                return str7;
        }
    }

    public String getTwoColor() {
        int number2 = scan.nextInt();
        if (number2 == 1) {
            String str = "Red-" +getColor();
            return str;
        } else if (number2 == 2) {
            String str = "Orange-" + getColor();
            return str;
        } else if (number2 == 3) {
            String str ="Yellow-"+ getColor() ;
            return str;
        } else if (number2 == 4) {
            String str = "Green-"+getColor() ;
            return str;
        } else if (number2 == 5) {
            String str ="Cyan-"+ getColor() ;
            return str;
        } else if (number2 == 6) {
            String str = "Blue-" +getColor();
            return str;
        } else if (number2 == 7) {
            String str ="Violet-"+ getColor() ;
            return str;
        } else if (number2 >= 8||number2<1) {
            String str ="Number is not corrected, please enter corrected number";
            return str;
        }
        String str = "";
        return str;
    }
    public Rainbow(){
        System.out.println("If you want to know which color goes under which number, enter the number at 1 by 7 for example: 2 ");
        System.out.println("You chose: " + getColor());
        System.out.println("If you want know a mix of two color, enter two number at 1 by 7 for example: 2 2 ");
        System.out.println("You chose: " + getTwoColor());
    }
}