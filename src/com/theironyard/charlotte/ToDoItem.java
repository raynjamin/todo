package com.theironyard.charlotte;

public class ToDoItem {
    public String text;
    public boolean isDone;
    public int id;


    public ToDoItem() {
    }

    public ToDoItem(String text, boolean isDone) {
        this.text = text;
        this.isDone = isDone;
    }

    public ToDoItem(int id, String text, boolean isDone) {
        this.id = id;
        this.text = text;
        this.isDone = isDone;
    }
}

