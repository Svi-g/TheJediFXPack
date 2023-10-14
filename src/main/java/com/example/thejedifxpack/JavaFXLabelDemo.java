package com.example.thejedifxpack;

import javafx.application.Application;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class JavaFXLabelDemo extends Application{

        public JavaFXLabelDemo() {

        }

public static void main(String... args){
        // As usual, call launch() to start the application.
                launch(args);
        }

        // Override the start() method.
        @Override
public void start(Stage primaryStage){
// Give the stage a title.
                primaryStage.setTitle("Demonstrate a JavaFX label.");
// Use a FlowPane for the root node.
                FlowPane rootNode = new FlowPane();
// Create a scene.
                Scene myScene = new Scene(rootNode, 300, 200);
// Set the scene on the stage.
                primaryStage.setScene(myScene);
// Create a label.
                Label myLabel = new Label("This is a JavaFX label");
// Add the label to the scene graph.
                rootNode.getChildren().add(myLabel);
// Show the stage and its scene.
                primaryStage.show();
        }
        public void stop() {
        }
}
