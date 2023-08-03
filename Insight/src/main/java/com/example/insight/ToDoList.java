package com.example.insight;

import java.io.IOException;

public class ToDoList {

    TaskDatabase database;

    public ToDoList(TaskDatabase database){
        database = this.database;
    }

    protected void addTask(String name, String taskType, String dayType, String dayTime) throws IOException {
        boolean accomplished = false;
        Integer satisfactionRating = null;
        name = '"' + name + '"';
        String taskString = name + "," + taskType + "," + dayType + "," + dayTime + "," + Boolean.toString(accomplished) + "," +
                            Integer.toString(satisfactionRating);
        database.add(taskString);
    }

    protected void editTask(){
    }

    protected void removeTask(Integer index) throws IOException {
        database.remove(index);
    }
}
