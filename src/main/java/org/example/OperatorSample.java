package org.example;

import java.util.ArrayList;
import java.util.List;

public class OperatorSample {

    static class Person {

        private String gender;
        private String name;

        public Person(String gender, String name) {
            this.gender = gender;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "gender='" + gender + '\'' +
                    ", name='" + name + '\'' +
                    '}';
        }

        public static void main(String[] args) {
            List<Person> per = List.of(new OperatorSample.Person("male", "dave"),
                    new OperatorSample.Person("female", "katie"),
                    new OperatorSample.Person("male", "john"),
                    new OperatorSample.Person("female", "nikkie"));

//imperative
//loop to take out females from list
            List<Person> perfemale = new ArrayList<>();

            for (Person p1 : per) {
                if ("female".equalsIgnoreCase(p1.gender))
                    perfemale.add(p1);
            }
            //loop to print females
            for (Person p : perfemale) {
                System.out.println(p);

            }


            //Declarative
            System.out.println("Declarative style");
        per.Stream().filter(i->"female.equalsIgnoreCase(i.gender)).collect(Collectors.toList()).forEach(System.out::println);

        }

    }
