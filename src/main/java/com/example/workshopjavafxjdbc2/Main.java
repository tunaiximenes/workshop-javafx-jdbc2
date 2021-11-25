package com.example.workshopjavafxjdbc2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
  @Override
  public void start(Stage primaryStage) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
            ScrollPane scrollpane = loader.load();

            scrollpane.setFitToHeight(true);
            scrollpane.setFitToWidth(true);

            Scene mainScene = new Scene(scrollpane);
            primaryStage.setScene(mainScene);
            primaryStage.setTitle("Sample JavaFX application!");
            primaryStage.show();
        } catch (IOException e) {
              e.printStackTrace();
        }
   }

    public static void main(String[] args) {
        launch();
    }
}