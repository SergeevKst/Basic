package phone.work.samsung;

import phone.work.phone.Phone;

public class Samsung extends Phone {
    {
        model = "Samsung";
        number = 375_444_678;
        weight = 10;
        name = "Kiril";
    }

    @Override
    public void receiveCall() {
        System.out.println("call " + this.name + " " + this.number);
    }
}
