package org.itstep;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        MyArrayList<Person> people = new MyArrayList<Person>();
        people.add(new Person("Nike", 19));
        people.add(new Person("Tara", 28));
        people.add(new Person("Nike", 19));
        people.add(new Person("Nike", 19));
        people.add(new Person("Valise", 20));
        people.add(new Person("Nike", 19));
        people.add(new Person("Stace", 28));
        people.add(new Person("Tom", 19));
        people.add(new Person("Jim", 20));
        people.add(new Person("Puma", 28));
        people.add(new Person("Coco", 19));
        people.add(new Person("Angela", 20));
        people.add(new Person("Maria", 20));
        people.add(new Person("Nike", 19));

        System.out.println(Arrays.toString(new MyArrayList[]{people}));
//        people.pushBack(new Person("PushBack", 12));
//        people.popFront();
//        people.pushFront(new Person("PushFront", 12));
//        people.insert(new Person("Insert", 1), 1);
//        people.insert(new Person("Insert", 5), 5);
//        people.removeAt(1);      System.out.println(Arrays.toString(new MyArrayList[]{people}));
//        people.popBack();
//        people.сlear();
//        people.remove(new Person("Puma", 28));
        people.removeAll(new Person("Nike", 19));
        System.out.println(Arrays.toString(new MyArrayList[]{people}));


    }
}
