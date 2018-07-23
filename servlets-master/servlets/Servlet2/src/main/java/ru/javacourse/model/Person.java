package ru.javacourse.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

public class Person {
   private String firstName;
   private String lastName;
   private int age;
   private Address address;
   private List<Phone> phones;

    public Person() {
    }

    public Person(String firstName, String lastName, int age, Address address, List<Phone> phones) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.phones = phones;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }
}
