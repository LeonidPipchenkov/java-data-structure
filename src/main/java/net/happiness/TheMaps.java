package net.happiness;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TheMaps {

    public static void main(String[] args) {
        hashMap();
        hashFunction();
    }

    private static void hashMap() {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("Alex"));
        map.put(2, new Person("Alexa"));
        map.put(3, new Person("Mariam"));

        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.size());
        System.out.println(map.containsKey(4));

        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());

        map.remove(3);
        System.out.println(map.getOrDefault(3, new Person("default")));

        map.entrySet().forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));
        map.forEach((key, person) -> System.out.println(key + " - " + person));
    }

    private static void hashFunction() {
        Map<Person, Diamond> map = new HashMap<>();
        Person person = new Person("Jamila");
        map.put(person, new Diamond("African Diamond"));
        System.out.println(person.hashCode());
        System.out.println(person.hashCode());
        System.out.println(map.get(person));
    }

    static class Person {

        String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }

    }

    record Diamond(String name) {}

}
