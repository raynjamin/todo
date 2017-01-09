package com.theironyard.charlotte;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDo {

    public static void main(String[] args) {
        ArrayList<ToDoItem> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Create to-do item");
            System.out.println("2. Toggle to-do item");
            System.out.println("3. List to-do items");

            String option = scanner.nextLine();

            if (option.equals("1")) {
                System.out.println("Enter your to-do item:");
                String text = scanner.nextLine();

                ToDoItem item = new ToDoItem(text, false);
                items.add(item);
            }

            else if (option.equals("2")) {
                System.out.println("Enter the number of the item you want to toggle:");
                int itemNum = Integer.valueOf(scanner.nextLine());
                ToDoItem item = items.get(itemNum - 1);
                item.isDone = !item.isDone;
            }

            else if (option.equals("3")) {
                for (int i = 1;i <= items.size();i++) {
                    ToDoItem item = items.get(i - 1);

                    // <boolean value> ? <thing to return if boolean is true> : <thing to return if boolean is false>
                    System.out.printf("[%s] %d. %s\n", item.isDone ? "x" : " ", i, item.text);
                }
            }

            else {
                System.out.println("That wasn't a choice, hombre.");
            }
        }
    }
}
