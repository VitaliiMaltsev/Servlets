package ru.javacourse.util;

import ru.javacourse.model.Address;
import ru.javacourse.model.Person;
import ru.javacourse.model.Phone;

import java.util.ArrayList;
import java.util.List;

public class PersonStorage {
    public static List<Person> getPersons() {
        List<Person> personList = new ArrayList<>();

        Phone p11 = new Phone("cell", "54426426542");
        Phone p12 = new Phone("home", "11111111111");
        Phone p13 = new Phone("work", "8287282877");
        List<Phone> phones = new ArrayList<>();
        phones.add(p11);
        phones.add(p12);
        phones.add(p13);


        Person p1 = new Person("Vova", "Ivanov", 20, new Address("Russia", "SPB", "Nevsky 10", 25414), phones);

        Phone p21 = new Phone("cell", "52528632");
        Phone p22 = new Phone("home", "25728872872");
        Phone p23 = new Phone("work", "2782872872");
        List<Phone> phones1 = new ArrayList<>();
        phones1.add(p21);
        phones1.add(p22);
        phones1.add(p23);


        Person p2 = new Person("Petya", "Petrov", 26, new Address("Ukraine", "Kyiv", "Zhdanova 34", 04214), phones1);

        personList.add(p1);
        personList.add(p2);
        return personList;
    }
}
