package HomeWork3;

import java.util.Scanner;

public class Rainbow {
    static Scanner scan = new Scanner(System.in);
    public String getColor() {
        int number1 = scan.nextInt();
        switch (number1) {
            case 1:
                return "Red";
            case 2:
                return "Orange" ;
            case 3:
                return "Yellow";
            case 4:
                return "Green";
            case 5:
                return "Cyan";
            case 6:
                return "Blue";
            case 7:
                return "Violet";
            default:
                return "Number is not corrected, please enter corrected number";
        }
    }

    public String getTwoColor() {
        int number2 = scan.nextInt();
        if (number2 == 1) {
            return "Red-" +getColor();
        } else if (number2 == 2) {
            return "Orange-" + getColor();
        } else if (number2 == 3) {
            return "Yellow-"+ getColor() ;
        } else if (number2 == 4) {
            return "Green-"+getColor();
        } else if (number2 == 5) {
            return "Cyan-"+ getColor() ;
        } else if (number2 == 6) {
            return "Blue-" +getColor();
        } else if (number2 == 7) {
            return "Violet-"+ getColor() ;
        } else if (number2 >= 8||number2<1) {
            return "Number is not corrected, please enter corrected number";
        }
        return "";
    }
    public Rainbow(){
        System.out.println("If you want to know which color goes under which number, enter the number at 1 by 7 for example: 2 ");
        System.out.println("You chose: " + getColor());
        System.out.println("If you want know a mix of two color, enter two number at 1 by 7 for example: 2 2 ");
        System.out.println("You chose: " + getTwoColor());
    }
}