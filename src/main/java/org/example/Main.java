package org.example;

import com.google.gson.Gson;
import com.sun.deploy.perf.PerfRollup;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();
        try {
            Person person = gson.fromJson(new FileReader("src/main/java/org/example/Person/Person.json"), Person.class);
            for (Person friend : person.friends) {
                System.out.println(friend.lastname);
                for (Phones phones : friend.phoneNumbers) {
                    System.out.println(" - phone type " + phones.type + ", phone number: " + phones.number);
                }
            }
        }catch (FileNotFoundException e){e.getMessage();}
    }
}

class Person {
    public String firstname;
    public String lastname;
    public int age;
    public Address address;
    public List<Phones> phoneNumbers;
    public List<Person> friends;

}

class Address {
    public String streetAddress;
    public String city;
    public String state;
    public int postalCode;
}

class Phones {
    public String type;
    public String number;
}