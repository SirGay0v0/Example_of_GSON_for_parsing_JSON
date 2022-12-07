package org.example;

import com.google.gson.Gson;
import com.sun.deploy.perf.PerfRollup;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Gson gson = new Gson();
//        try {
//            Person person = gson.fromJson(new FileReader("src/main/java/org/example/Person/Person.json"), Person.class);
//            for (Person friend : person.friends) {
//                System.out.println(friend.firstname);
////                for (Phones phones : friend.phoneNumbers) {
////                    System.out.println(" - phone type " + phones.type + ", phone number: " + phones.number);
////                }
//            }
//            for (Person friend : person.friends) {
//                System.out.println(friend.firstname);
//            }
//        } catch (FileNotFoundException e) {
//            e.getMessage();
//        }


        Counter counter = new Counter();
        Thread thread = new CounterThread(counter);
        Thread thread1 = new CounterThread(counter);

        thread.start();
        thread1.start();
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