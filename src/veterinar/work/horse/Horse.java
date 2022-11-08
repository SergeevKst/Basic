package veterinar.work.horse;

import veterinar.work.animal.Animal;

public class Horse extends Animal {

    {
        food = "weed";
        location = "field";
    }

    @Override
    public void eat() {
        System.out.println("horse eat " + this.food + " on the " + this.location);

    }

    @Override
    public void makeNoize() {
        System.out.println("igo-go");
    }
}
