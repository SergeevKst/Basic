package phone.work.runner;

import phone.work.apple.Apple;
import phone.work.nokia.Nokia;
import phone.work.phone.Phone;
import phone.work.samsung.Samsung;

public class Runner {
    public static void main(String[] args) {
        Phone nokia = new Nokia();
        Phone samsung = new Samsung();
        Phone apple = new Apple();

        apple.receiveCall();
        System.out.println(apple.getNumber());
        apple.sendMessage();

        samsung.receiveCall();
        System.out.println(samsung.getNumber());
        samsung.sendMessage();

        nokia.receiveCall();
        System.out.println(nokia.getNumber());
        nokia.sendMessage();
    }
}
