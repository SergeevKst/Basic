
package home_work_8.my_arraylist;

import home_work_8.my_list.MyList;

public class MyArrayList<T> implements MyList<T> {


    private static final int DEFAULT_CAPACITY = 10;
    private int variableCapacity;

    private Object[] defaultLists;
    private int count = 0;

    public MyArrayList() {
        this.defaultLists = new Object[10];
    }

    public MyArrayList(int capacity) {
        this.variableCapacity = capacity;
        this.defaultLists = new Object[capacity];
    }

    public MyArrayList(MyList<? extends T> col) {
        Object[] array = col.toArray(new Object[col.size()]);
        this.defaultLists = new Object[DEFAULT_CAPACITY];
        for (int i = 0; i < defaultLists.length; i++) {
            if (i == array.length) {
                Object[] lists = new Object[array.length];
                System.arraycopy(array, 0, lists, 0, array.length);
                defaultLists = lists;
            }
        }
    }

    @Override
    public int size() {
        int count1 = 0;
        for (Object size : defaultLists) {
            if (size != null) {
                count1++;
            }
        }
        return count1;
    }

    @Override
    public boolean add(int index, T value) {
        for (int i = 0; i < defaultLists.length; i++) {
            if (i == index && defaultLists[i] == null) {
                defaultLists[i] = value;
                count++;
                return true;
            } else if (i == index && defaultLists[i] != null) {
                Object[] list = new Object[defaultLists.length + 1];
                System.arraycopy(defaultLists, 0, list, 0, index);
                list[index] = value;
                System.arraycopy(defaultLists, index, list, index + 1, defaultLists.length - index);
                defaultLists = list;
                count++;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        for (Object o : defaultLists) {
            if (count != 0 || o == null) return false;
        }
        return true;
    }

    @Override
    public boolean contains(Object value) {
        for (Object o : defaultLists) {
            if (o == value) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean add(T value) {
        for (int i = 0; i < defaultLists.length; i++) {
            if (i == defaultLists.length - 1) {
                Object[] list = new Object[defaultLists.length + 1];
                System.arraycopy(defaultLists, 0, list, 0, defaultLists.length);
                list[defaultLists.length] = value;
                defaultLists = list;
                count++;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean remove(Object value) {
        for (int i = 0; i < defaultLists.length; i++) {

            if (defaultLists[i] == (value)) {
                Object[] list = new Object[defaultLists.length - 1];
                System.arraycopy(defaultLists, 0, list, 0, i);
                System.arraycopy(defaultLists, i + 1, list, i, defaultLists.length - i - 1);
                defaultLists = list;
                count--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean addAll(MyList<? extends T> value) {
        Object[] col = value.toArray(new Object[value.size()]);
        if (col.length == 0) {
            return false;
        }
        for (int i = 0; i < defaultLists.length; i++) {
            if (i == col.length) {
                Object[] list = new Object[defaultLists.length + col.length];
                System.arraycopy(defaultLists, 0, list, 0, defaultLists.length);
                System.arraycopy(col, 0, list, defaultLists.length, col.length);
                defaultLists = list;
                return true;
            }
        }
        return false;
    }

    @Override
    public T get(int index) {
        for (int i = 0; i < defaultLists.length; i++) {
            if (i == index && defaultLists[i] != null) {
                return (T) defaultLists[i];
            }
        }
        return null;
    }

    @Override
    public T remove(int index) {
        for (int i = 0; i < defaultLists.length; i++) {
            if (i == (index)) {
                Object value = defaultLists[i];
                Object[] list = new Object[defaultLists.length - 1];
                System.arraycopy(defaultLists, 0, list, 0, i);
                System.arraycopy(defaultLists, i + 1, list, i, defaultLists.length - i - 1);
                defaultLists = list;
                count--;
                return (T) value;
            }
        }
        return null;
    }

    @Override
    public T set(int index, T value) {
        String str = "lists is empty";
        for (int i = 0; i < defaultLists.length; i++) {
            if (index == i && defaultLists[i] != null) {
                Object value2 = defaultLists[i];
                defaultLists[i] = value;
                return (T) value2;
            }
        }
        return (T) str;
    }

    @Override
    public int indexOf(Object value) {
        for (int i = 0; i < defaultLists.length; i++) {
            if (defaultLists[i] == value) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void clear() {
        for (int i = 0; i < defaultLists.length; i++) {
            if (defaultLists[i] != null) {
                defaultLists[i] = null;
            }
        }
    }

    @Override
    public Object[] toArray(Object[] value) {
        Object[] l = new Object[value.length];
        System.arraycopy(value, 0, l, 0, value.length);
        return l;
    }
}