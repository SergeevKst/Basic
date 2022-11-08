package phone.work.nokia;

import phone.work.phone.Phone;

public class Nokia extends Phone {
    {
        model = "Nokia";
        number = 375_000_678;
        weight = 25;
        name = "Masha";
    }

    @Override
    public void receiveCall() {
        System.out.println("call " + this.name + " " + this.number);
    }
}
