package HomeWork2;

public class Main {
    public static void main(String[] args) {
        Variables learn = new Variables();
        learn.setNum1((byte) 10);
        byte res1 = learn.getNum1();
        System.out.println(res1);

        learn.setNum2((short) 129);
        short res2 = learn.getNum2();
        System.out.println(res2);

        learn.setNum3((int) 500);
        int res3 = learn.getNum3();
        System.out.println(res3);

        learn.setNum4((long) 5000);
        long res4 = learn.getNum4();
        System.out.println(res4);

        learn.setNum5((float) 1.12);
        float res5 = learn.getNum5();
        System.out.println(res5);

        learn.setNum6((double) 1.12);
        double res6 = learn.getNum6();
        System.out.println(res6);

        learn.setNum7((char) 1);
        char res7 = learn.getNum7();
        System.out.println(res7);

        learn.setNum8((boolean) true);
        boolean res8 = learn.isNum8();
        System.out.println(res8);

        learn.setStr("Hi");
        String res9 = learn.getStr();
        System.out.println(res9);


        learn.setNum9((byte) 12);
        Byte res10 = learn.getNum9();
        System.out.println(res10);

        learn.setNum10((short) 110);
        Short res11 = learn.getNum10();
        System.out.println(res11);

        learn.setNum11((Integer) 110);
        Integer res12 = learn.getNum11();
        System.out.println(res12);

        learn.setNum12((Long) 110000L);
        Long res13 = learn.getNum12();
        System.out.println(res13);

        learn.setNum13((Float) 11.2f);
        Float res14 = learn.getNum13();
        System.out.println(res14);

        learn.setNum14((Double) 11.222);
        Double res15 = learn.getNum14();
        System.out.println(res15);

        learn.setNum15((Character) 'A');
        Character res16 = learn.getNum15();
        System.out.println(res16);

        learn.setNum16((Boolean) true);
        Boolean res17 = learn.getNum16();
        System.out.println(res17);
    }
}