package veterinar.work.dog;

import veterinar.work.animal.Animal;

public class Dog extends Animal {
    {
        food = "meat";
        location = "garden";
    }

    @Override
    public void eat() {
        System.out.println("dog eat " + this.food + " in the " + this.location);

    }

    @Override
    public void makeNoize() {
        System.out.println("gav-gav");
    }
}
