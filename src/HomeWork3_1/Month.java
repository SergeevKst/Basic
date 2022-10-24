package HomeWork3_1;

import java.util.Scanner;

public class Month {
    Scanner scann = new Scanner(System.in);

    public String getNumber() {
        int number = scann.nextInt();
        if (1 <= number && number <= 2 || number == 12) {
            String str = "Winter";
            return str;
        } else if (3 <= number && number <=5) {
            String str = "Spring";
            return str;
        }else if (6 <= number && number <=8) {
            String str = "Summer";
            return str;
        }else if (9 <= number && number <=11) {
            String str = "Autumn";
            return str;
    }else if (1>number||number>12){
            String str= "Create new month number: ";
            return str;
        }
        String str="";
        return str;
    }
public Month(){
    System.out.print("Enter number month: ");
    System.out.println("Time of year: " + getNumber());
}
}
