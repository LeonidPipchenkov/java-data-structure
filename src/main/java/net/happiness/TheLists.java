package net.happiness;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class TheLists {

    public static void main(String[] args) {
        arrayList();
        linkedList();
    }

    private static void arrayList() {
        List<String> unmodifiableColors = List.of("blue", "yellow");
        List<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("purple");
        colors.add("yellow");

        System.out.println(colors);
        System.out.println(colors.size());
        System.out.println(colors.contains("yellow"));
        System.out.println(colors.contains("pink"));

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
        for (String color : colors) {
            System.out.println(color);
        }
        colors.forEach(System.out::println);
    }

    private static void linkedList() {
        LinkedList<Person> people = new LinkedList<>();
        people.add(new Person("Alex", 21));
        people.add(new Person("Alexa", 21));
        people.addFirst(new Person("Ali", 18));

        ListIterator<Person> peopleIterator = people.listIterator();
        while (peopleIterator.hasNext()) {
            System.out.println(peopleIterator.next());
        }
        while (peopleIterator.hasPrevious()) {
            System.out.println(peopleIterator.previous());
        }
    }

    record Person(String name, int age) {}

}
