package org.itstep;

import javax.xml.namespace.QName;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return '('+ name + '-' + age + ')';
    }

    @Override
    public boolean equals(Object person){
        if(this.getName().equals(((Person)person).getName())&&this.getAge()==((Person)person).getAge()){
            return true;
        }else {
            return false;
        }

    }
}
