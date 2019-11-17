package Task_6;

import java.util.ArrayList;

public class Main {

    private static ArrayList<Thing> backpack = new ArrayList<>();

    public static void main(String[] args) {
        Backpack backpack = new Backpack();
        backpack.add(new Thing(25, 40));
        backpack.add(new Thing(75, 40));
        backpack.add(new Thing(75, 40));

        for (var item : backpack.getThings()) {
            System.out.println(item.getCost() + " " + item.getWeight());
        }
    }
}
