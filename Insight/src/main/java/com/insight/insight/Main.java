/*
 * Classname: EQ3
 *
 * Author: Lat, Tamano
 *
 * Date: 10/07/2023
 *
 * Description: The main part of the program
 */
package com.insight.insight;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        Scene menu = new Scene(root); // Initialize the Menu

        /* Main Menu Scene */
        primaryStage.setTitle("Insight");
        primaryStage.setScene(menu);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}