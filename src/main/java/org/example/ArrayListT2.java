package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListT2 {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<Person>(); // list로 선언
        list.add(new Person("a",22));
        list.add(new Person("b", 24));
        list.add(new Person("c", 30));
        Person p = list.get(0);
        System.out.printf("name: %s, age: %s", p.name, p.age); // name: a, age: 22
        System.out.println("================");
        // foreach 를 돌려서 각 Person의 이름과 나이를 출력 해 보시오.
        for(Person pp : list){
            System.out.printf("name: %s, age: %s \n", pp.name, pp.age);
        }

        Person[] persons = new Person[3]; // 배열로 선언
        persons[0] = new Person("a",22);
        persons[1] = new Person("b",24);
        persons[2] = new Person("c",30);

        Person[] persons2 = new Person[]{
                new Person("a",22),
                new Person("b",24),
                new Person("c",30),
        };
        System.out.println("========================");
        // 배열 -> 리스트로
        ArrayList<Person> list2 = new ArrayList<Person>(Arrays.asList(persons2));
        for(Person pp : list2){
            System.out.printf("name: %s, age: %s \n", pp.name, pp.age);
        }
    }
}
class Person {
    String name;
    Integer age;
    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
