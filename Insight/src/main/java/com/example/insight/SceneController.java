package com.example.insight;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void  SwitchToMainMenu(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Insight");
        stage.setScene(scene);
        stage.show();
    }

    public void  SwitchToStudyTimer(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("StudyTimer.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Insight - Study Timer");
        stage.setScene(scene);
        stage.show();
    }

    public void  SwitchToToDoList(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ToDoList.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Insight - ToDo List");
        stage.setScene(scene);
        stage.show();
    }

    public void  SwitchToNotebook(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Notebook.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Insight - Notebook");
        stage.setScene(scene);
        stage.show();
    }

    public void Quit(ActionEvent event) throws IOException {
        Platform.exit();
        System.exit(0);
    }
}