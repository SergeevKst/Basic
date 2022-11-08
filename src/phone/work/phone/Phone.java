package phone.work.phone;

public class Phone {
    protected String model;
    protected long number;
    protected int weight;
    protected String name;

    public Phone(long number, int weight, String model) {
        this(model, number);
        this.weight = weight;
    }

    public Phone(String model, long number) {
        this.model = model;
        this.number = number;
    }

    public Phone() {
    }

    public void receiveCall() {
        System.out.println("call " + this.name);
    }

    public void sendMessage() {
        System.out.println("send on this number? " + number);
    }

    public long getNumber() {
        return number;
    }
}
