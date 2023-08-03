package com.example.insight;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class TaskDatabase {
    protected ArrayList<Task> tasksList = loadFile();

    // open database and return as arraylist
    protected ArrayList<Task> loadFile(){
        ArrayList<Task> tasks = new ArrayList<>();
        String[] task;
        try {

            // Scanner Object reads the line from the file
            FileReader fileReader = new FileReader("assets/" + Main.taskDatabaseFile);

            // System.in reads from console while this reads from file
            Scanner text = new Scanner(fileReader);

            while (text.hasNext()) {
                String line = text.nextLine();

                task = line.split(",");
                Task tempTask = new Task();

                tempTask.setName(task[0]);
                tempTask.setTaskType(task[1]);
                tempTask.setDayType(task[2]);
                tempTask.setDayTime(task[3]);
                tempTask.setAccomplished(Boolean.parseBoolean(task[4]));
                tempTask.setSatisfactionRating(Integer.valueOf(task[5]));

                tasks.add(tempTask);
            }

            fileReader.close();
        } catch (FileNotFoundException e) {
            File database = new File("assets/" + Main.taskDatabaseFile);
            System.out.println("File created: " + database.getName());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return tasks;
    }

    protected int getSize() {
        return this.tasksList.size();
    }

    protected Task getTask(int index){
        return tasksList.get(index);
    }

    protected void remove(int index) throws IOException {
        tasksList.remove(index);

        String taskString;
        FileWriter fileWriter = new FileWriter("assets/" + Main.taskDatabaseFile, false);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        // Erase everything in the database file
        bufferedWriter.write("");
        bufferedWriter.close();
        fileWriter.close();

        // Rewrite everything with data in the taskList ArrayList
        for (int i = 0; i < getSize(); i++) {

            String name = tasksList.get(i).getName();
            String taskType = tasksList.get(i).getTaskType();
            String dayType = tasksList.get(i).getDayType();
            String dayTime = tasksList.get(i).getDayTime();
            boolean accomplished = tasksList.get(i).getAccomplished();
            Integer satisfactionRating = tasksList.get(i).getSatisfactionRating();
            taskString = name + "," + taskType + "," + dayType + "," + dayTime + "," + Boolean.toString(accomplished) + "," +
                         Integer.toString(satisfactionRating);
            add(taskString);
        }
    }

    protected void add(String task) throws IOException {
        FileWriter fileWriter = new FileWriter("assets/" + Main.taskDatabaseFile, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(task);

        bufferedWriter.close();
        fileWriter.close();
    }
}
