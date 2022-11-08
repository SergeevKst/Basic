package phone.work.apple;

import phone.work.phone.Phone;

public class Apple extends Phone {
    {
        model = "Apple";
        number = 375_529_678;
        weight = 20;
        name = "Vasil";
    }

    @Override
    public void receiveCall() {
        System.out.println("call " + this.name + " " + this.number);
    }

    @Override
    public void sendMessage() {
        System.out.println("send on this number? " + number);
    }
}
