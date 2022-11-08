package veterinar.work.runner;

import veterinar.work.animal.Animal;
import veterinar.work.cat.Cat;
import veterinar.work.dog.Dog;
import veterinar.work.horse.Horse;
import veterinar.work.veterinar.Veterinar;

public class Runner {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Veterinar veterinar = new Veterinar(animal);
        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Horse();
        for (Animal value : animals) {
            veterinar.treatAnimal(value);
        }
    }
}