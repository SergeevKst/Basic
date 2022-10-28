package HomeWork4;


import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Cat {
    //    Созданы дефолтные переменные для использования в пункете 6. Задаються в конструкторе , так же использованы в пункте 1
    //    Так же можно использовать специальные методы creatAge(),creatName(), рандомно создающие возраст и имена
    private String name;
    private int age;

    public void createdCats() {
        System.out.println("Create 10 cats with default name and year: ");
        int age = 0;
        while (age < 10) {
            System.out.println("Name: " + this.name + ", Age: " + this.age + " month");
            age++;
        }

    }

    // Метод подбирает рандомный возрост
    public int creatAge() {
        Random random = new Random();
        int index = random.nextInt(24 + 1);
        return index;
    }

    //Переопределение метода toString() применяя к объекту будет генерировать ему рандомное имя ( не использовал так как не указано где)

    @Override
    public String toString() {
        String string = creatName();
        return string;
    }

    // Метод подбирает рандомное имя
    public String creatName() {
        char[] array = new char[8];
        int name;
        Random random = new Random();
        for (int i = 0; i < 8; i++) {
            name = random.nextInt(25) + 'a';
            array[i] = (char) name;
        }
        String string = new String(array);
        return string;
    }

    // Метод принимает имя, вводиое в терминале использован next() что бы не забирало ничего после пробела в терминале для 5 пункта
    public String getName() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        return name;
    }

    // Метод принимает возрост, вводиое в терминале использован next() что бы не забирало ничего после пробела в терминале для 5 пункта
    public int getAge() {
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();
        return age;
    }

    // 5 пункт выводит 10 ктов с именами и возростом заданными через getName(),getAge()
    public void setCats() {
        System.out.println("If you want enter the name and the age, please remember max age 28, for example: Barsik 22");
        for (int i = 0; i < 10; i++) {
            System.out.println("Name: " + getName() + ", Age: " + getAge());
        }
    }

    //  Конструктор для инициализации переменных name и age далее переменные используются для пункта 6
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // пункт 6 создаёт 10 котов с именем и возростом заданными через конструктор
    public void setCat() {
        System.out.println("We create 10 cats: ");
        int i = 0;
        do {
            System.out.println("Name: " + this.name + ", Age: " + this.age);
            i++;
        } while (i < 10);
    }

    // 7 пункт метод для создания 10 котов при помощи for each использованы методы рандомного имени и возроста
    // Можно использовать дефолтные переменные как и задано в дз
    public void setForCat() {
        System.out.println("We create 5 cats:");
        String[] cats = new String[5];
        int i = 0;

        for (String cat : cats) {
            cat = "Name: " + creatName() + ", Age: " + creatAge();
            System.out.println(cat);
        }


    }

    // Переопределен метод equals теперь два разных объекта от класса Cat с одинаковыми именами и возростом будут равны ( не использовал так как не указано где)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        if (age != cat.age) return false;
        return Objects.equals(name, cat.name);
    }

    public void start() {
        while (true) {
            System.out.println("If you want to check the work cycle: (while) enter-1; (for) enter-2; (do while) enter-3; (for each) enter-4:");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            if (number == 1) {
                createdCats();
            } else if (number == 2) {
                setCats();
            } else if (number == 3) {
                setCat();
            } else if (number == 4) {
                setForCat();
            } else if (number < 1 || number > 4) {
                System.out.println("Error");
            }

        }

    }
}