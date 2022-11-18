package home_work_8.menu;

import home_work_8.my_arraylist.MyArrayList;
import home_work_8.my_list.MyList;

public class Menu {
    public static void start() {

        MyList<String> stringMyLists = new MyArrayList<>();

        stringMyLists.add(1, "Maks");
        stringMyLists.add(2, "Kiril");
        stringMyLists.add(3, "Misha");
        stringMyLists.add(2, "Mis");

        String name = "Katy";
        String name1 = "Pety";

        stringMyLists.add(name);
        stringMyLists.add(name1);

        stringMyLists.remove("Mis");

        stringMyLists.contains("Misha");

        stringMyLists.get(2);

        stringMyLists.isEmpty();

        stringMyLists.remove(1);

        stringMyLists.set(2, "Georg");

        stringMyLists.indexOf("Nikola");

        stringMyLists.size();

        MyList<String>myList2=new MyArrayList<>();

        myList2.add("lok");
        myList2.add("luffi");

        stringMyLists.addAll(myList2);

        stringMyLists.clear();

    }
}
