package com;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

  @Override
  public void start(Stage primaryStage) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("view/simpleUI.fxml"));

    Scene scene = new Scene(root, 1315, 890);
    primaryStage.setScene(scene);
    primaryStage.show();
  }
}
