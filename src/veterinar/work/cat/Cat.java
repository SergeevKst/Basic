package veterinar.work.cat;

import veterinar.work.animal.Animal;

public class Cat extends Animal {
    {
        food = "wiskas";
        location = "house";
    }

    public void eat() {
        System.out.println("cat eat " + this.food + " in the " + this.location);

    }

    @Override
    public void makeNoize() {
        System.out.println("mey-mey");
    }
}
