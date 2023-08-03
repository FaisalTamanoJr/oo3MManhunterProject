package com.example.insight;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ToDoListController implements Initializable {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private TableColumn<Task,String> taskType;

    @FXML
    private TableColumn<Task,String> name;

    @FXML
    private TableView<Task> taskTable;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        taskType.setCellValueFactory(new PropertyValueFactory<>("taskType"));
        taskTable.setItems(Main.storedTasksO);
    }

    public void switchToMainMenu(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void removeTask(ActionEvent event) throws IOException{
        int selectedTask = taskTable.getSelectionModel().getSelectedIndex();
        taskTable.getItems().remove(selectedTask);
        Main.toDoList.removeTask(selectedTask);
    }
}