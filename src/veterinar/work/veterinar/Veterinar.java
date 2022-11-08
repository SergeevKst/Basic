package veterinar.work.veterinar;

import veterinar.work.animal.Animal;

public class Veterinar {
    Animal animal;

    public Veterinar(Animal animal) {
        this.animal = animal;
    }

    public void treatAnimal(Animal animal) {
        animal.eat();

    }
}
