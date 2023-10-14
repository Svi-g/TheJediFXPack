package com.example.thejedifxpack;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.FlowPane;

public class JavaFXSkelg extends Application {
    public JavaFXSkelg() {

    }
    public static void main(String... args) {
        System.out.println("Launching JavaFX application.");
        // Start the JavaFX application by calling launch().
        launch(args);
    }

    // Override the init() method.
    public void init() {
        System.out.println("Inside the init() method.");
    }

    // Override the start() method.
    public void start(Stage myStage) {
        System.out.println("Inside the start() method.");
        // Give the stage a title.
        myStage.setTitle("Skeleton App.");
        // Create a root node. In this case, a flow layout pane
        // is used, but several alternatives exist.
        FlowPane rootNode = new FlowPane();
        // Create a scene.
        //Scene myScene = new Scene(rootNode, 300, 200);
        // Set the scene on the stage.
        //myStage.setScene(myScene);
        // so when you want to combine the two arguments do this
        myStage.setScene(new Scene(rootNode, 300, 200));
        // Show the stage and its scene.
        myStage.show();
    }

    // Override the stop() method.
    public void stop() {
        System.out.println("Inside the stop() method.");
    }
}
