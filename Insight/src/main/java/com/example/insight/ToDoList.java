package com.example.insight;

import java.io.IOException;

public class ToDoList {

    TaskDatabase database;

    public ToDoList(TaskDatabase database){
        this.database = database;
    }

    protected void addTask(String name, String taskType, String dayType, String dayTime) throws IOException {
        boolean accomplished = false;
        Integer satisfactionRating = 0;
        name = '"' + name + '"';
        String taskString = name + "," + taskType + "," + dayType + "," + dayTime + "," + Boolean.toString(accomplished) + "," +
                            Integer.toString(satisfactionRating) + "\n";
        database.add(taskString);
    }

    protected void editTask(){
    }

    protected void removeTask(Integer index) throws IOException {
        database.remove(index);
    }
}
