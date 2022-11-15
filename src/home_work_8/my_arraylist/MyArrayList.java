
package home_work_8.my_arraylist;

import home_work_8.my_list.MyList;

import java.util.Collection;

public class MyArrayList<T> implements MyList<T> {


    private int capacity;
    private Object[] more;
    private int count = 0;

    public MyArrayList() {
        this.more = new Object[10];
    }

    public MyArrayList(int capacity) {
        this.capacity = capacity;
        this.more = new Object[this.capacity];
    }

    public MyArrayList(MyList<?extends T> col) {

        this.more = more;
    }

    @Override
    public int size() {
        for (Object size : more) {
            if (size != null) {
                count++;
            }
        }
        return count;
    }

    @Override
    public boolean add(int index, T value) {
        for (int i = 0; i < more.length; i++) {
            if (i == index && more[i] == null) {
                more[i] = value;
                return true;
            } else if (i == index && more[i] != null) {
                Object[] list = new Object[more.length + 1];
                System.arraycopy(more, 0, list, 0, index);
                list[index] = value;
                System.arraycopy(more, index, list, index + 1, more.length - index);
                more = list;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        for (Object o : more) {
            if (count != 0 || o == null) return false;
        }
        return true;
    }

    @Override
    public boolean contains(Object value) {
        for (Object o : more) {
            if (o == value) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean add(T value) {
        for (int i = 0; i < more.length; i++) {
            if (i == more.length - 1) {
                Object[] list = new Object[more.length + 1];
                System.arraycopy(more, 0, list, 0, more.length);
                list[more.length] = value;
                more = list;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean remove(Object value) {
        for (int i = 0; i < more.length; i++) {

            if (more[i] == (value)) {
                Object[] list = new Object[more.length - 1];
                System.arraycopy(more, 0, list, 0, i);
                System.arraycopy(more, i + 1, list, i, more.length - i - 1);
                more = list;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> value) {
        Object[] col = value.toArray();
        if (col.length == 0) {
            return false;
        }
        for (int i = 0; i < more.length; i++) {
            if (i == col.length) {
                Object[] list = new Object[more.length + col.length];
                System.arraycopy(more, 0, list, 0, more.length);
                System.arraycopy(col, 0, list, more.length, col.length);
                more = list;
                return true;
            }
        }
        return false;
    }

    @Override
    public T get(int index) {
        for (int i = 0; i < more.length; i++) {
            if (i == index && more[i] != null) {
                return (T) more[i];
            }
        }
        return null;
    }

    @Override
    public T remove(int index) {
        for (int i = 0; i < more.length; i++) {
            if (i == (index)) {
                Object value = more[i];
                Object[] list = new Object[more.length - 1];
                System.arraycopy(more, 0, list, 0, i);
                System.arraycopy(more, i + 1, list, i, more.length - i - 1);
                more = list;
                return (T) value;
            }
        }
        return null;
    }

    @Override
    public T set(int index, T value) {
        for (int i = 0; i < more.length; i++) {
            if (index == i) {
                Object value2 = more[i];
                more[i] = value;
                return (T) value2;
            }
        }
        return null;
    }

    @Override
    public int indexOf(Object value) {
        for (int i = 0; i < more.length; i++) {
            if (more[i] == value) {
                return i;
            }
        }
        return -1;
    }
}