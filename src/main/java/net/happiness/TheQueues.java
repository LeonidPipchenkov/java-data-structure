package net.happiness;

import java.util.LinkedList;
import java.util.Queue;

public class TheQueues {

    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>();
        queue.add(new Person("Alex", 21));
        queue.add(new Person("Mariam", 18));
        queue.add(new Person("Ali", 40));
        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.size());
        System.out.println(queue.peek());
    }

    record Person(String name, int age) {}

}
