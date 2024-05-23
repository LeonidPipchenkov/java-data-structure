package net.happiness;

import java.util.ArrayList;
import java.util.List;

public class TheLists {

    public static void main(String[] args) {
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

}
