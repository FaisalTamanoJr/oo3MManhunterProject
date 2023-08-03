package com.example.insight;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    public static final String taskDatabaseFile = "taskDatabase.csv";
    protected static TaskDatabase storedTasks;
    protected static ToDoList toDoList;
    protected static ObservableList<Task> storedTasksO;

    @Override
    public void start(Stage stage) throws IOException {
        storedTasks = new TaskDatabase();
        toDoList = new ToDoList(storedTasks);
        storedTasksO = FXCollections.observableArrayList(storedTasks.tasksList);

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("Main.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1920, 1080);
        stage.setTitle("Insight");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
