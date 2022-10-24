package HomeWork3_1;

import java.util.Scanner;

public class Money {
    Scanner scanner = new Scanner(System.in);
    public void setMoney (){
        System.out.println("Введите сумму в рублях: ");
        int rubels = scanner.nextInt();
        int rubel = rubels%10;
        if (rubels%100>=11&&rubels%100<=14) {
            System.out.println(rubels+" рублей");
        }else if (2<=rubel&&rubel<=4) {
            System.out.println(rubels+" рубля");
        }else if (5<=rubel&&rubel<=9||rubel==0){
            System.out.println(rubels+" рублей");
        }else if (rubel==1){
            System.out.println(rubels+" рубль");
        }
    }
}
