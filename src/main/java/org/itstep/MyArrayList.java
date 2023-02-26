package org.itstep;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<T> implements Iterable<T> {
    private static int size = 0;
    private int capacity;
    private Object[] data = new Object[0];


    public MyArrayList(int capacity) {
        this.capacity = 0;
    }

    public MyArrayList() {
        capacity = 10;
    }
    protected void ensureCapacity() {
        if (size > capacity) {
            if (capacity == 0) {
                capacity = 1;
            }
            data = Arrays.copyOf(data, (int) Math.ceil((capacity * 1.5 + 1)));
            int c = data.length;
        } else {
            data = Arrays.copyOf(data, capacity);
        }
        capacity = data.length;
    }

    public void add(T o) {
        size++;
        ensureCapacity();
        data[size - 1] = o;
    }


    public void popFront() {
       removeAt(0);
    }

    public void pushFront(T o) {
        size++;
        ensureCapacity();
        Object[] d = new Object[data.length];
        for (int i = 1; i < data.length; i++) {
            d[i] = data[i - 1];
        }
        d[0] = o;
        data = d;
    }

    public void insert(T o, int idx) {
        if (idx < size) {
            size++;
            ensureCapacity();
            Object[] d = new Object[data.length];
            for (int i = 0; i < size; i++) {
                if (i < idx) {
                    d[i] = data[i];
                } else if (i == idx) {
                    d[i] = o;
                } else {
                    d[i] = data[i - 1];
                }
            }
            data = d;
        } else {
            System.out.println("Exception Insert!!!");
        }
    }

    public void pushBack(T o) {
        size++;
        ensureCapacity();
        data[size - 1] = o;
    }

    public void popBack() {
        removeAt(size-1);
    }
    public void removeAt(int idx) {
        if (idx < size) {
            Object[]d = new Object[data.length];
            for (int i = 0; i < size-1; i++) {
                if(idx>i){
                    d[i]=data[i];
                } else if (idx<=i) {
                    d[i]=data[i+1];
                }
            }
            data = d;
            size--;
        } else {
            System.out.println("Exception Remove!!!");
        }
    }

    public void remove(T o) {
        int idx = -1;
        for (int i = 0; i < size; i++) {
            if (data[i].equals(o)) {
                idx = i;
                removeAt(idx);
            }
        }
    }

    public void removeAll(T o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(data[i])) {
               removeAt(i); i--;
                }
        }
    }

    public void сlear() {
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
        size = 0;
    }

    @Override
    public String toString() {
        StringBuilder strObj = new StringBuilder();
        for (Object o : data) {
            strObj.append(o).append(" ");
        }
        return (String) strObj.toString();
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator() {
            int i = 0;

            @Override
            public boolean hasNext() {
                return i < data.length;
            }

            @Override
            public T next() {
                return (T) data[i++];
            }
        };
    }

    public T get(int i) {
        return (T) data[i];
    }
}
