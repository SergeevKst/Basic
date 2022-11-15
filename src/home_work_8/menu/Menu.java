package home_work_8.menu;

import home_work_8.my_arraylist.MyArrayList;
import home_work_8.my_list.MyList;
import java.util.Collection;
public class Menu {
    public static void start() {
        MyList<String> array = new MyArrayList<>();

        array.add(1, "Maks");
        array.add(2, "Kiril");
        array.add(3, "Misha");
        array.add(2, "Mis");

        String name = "Katy";
        String name1 = "Pety";

        array.add(name);
        array.add(name1);

        array.remove("Mis");

        array.contains("Misha");

        array.get(2);

        array.isEmpty();

        array.remove(1);

        array.set(2, "Georg");

        array.indexOf("Nikola");

        array.size();

        MyList<String> stringMyList= new MyArrayList<>();

        stringMyList.add("Clone");

        array.addAll(stringMyList);
    }
}
