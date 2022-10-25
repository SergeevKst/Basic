package HomeWork3_1;

import java.util.Scanner;

public class Month {
    Scanner scann = new Scanner(System.in);

    public String getNumber() {
        int number = scann.nextInt();
        if (1 <= number && number <= 2 || number == 12) {
            return "Winter";
        } else if (3 <= number && number <=5) {
            return "Spring";
        }else if (6 <= number && number <=8) {
            return "Spring";
        }else if (9 <= number && number <=11) {
            return "Autumn";
    }else if (1>number||number>12){
            return "Create new month number: ";
        }
        return "";
    }
public Month(){
    System.out.print("Enter number month: ");
    System.out.println("Time of year: " + getNumber());
}
}
