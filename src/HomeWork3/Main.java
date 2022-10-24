package HomeWork3;

public class Main {
    public static void main(String[] args) {
        System.out.println("If you want to know which color goes under which number, enter the number at 1 by 7 for example: 2 ");
        Rainbow Color = new Rainbow();
        System.out.println("You chose: " + Color.getColor());
        System.out.println("If you want know a mix of two color, enter two number at 1 by 7 for example: 2 2 ");
        System.out.println("You chose: " + Color.getTwoColor());
    }

}