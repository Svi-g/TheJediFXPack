package com.example.thejedifxpack;

import javafx.application.Application;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;
public class JavaFXEventDemo extends Application {
    Label response;
    public JavaFXEventDemo() {

    }

    public static void main(String... args) {
        launch(args);
    }

    @Override
    public void start(Stage myStage) {
        myStage.setTitle("Demonstrate JavaFX Buttons and Events.");
        // specify gaps kwiFLowpane ze kube kuhle
        FlowPane rootNode = new FlowPane(10, 10);
        // Center the controls in the scene.
        rootNode.setAlignment(Pos.CENTER);
// Create a scene.
        Scene myScene = new Scene(rootNode, 300, 100);
// Set the scene on the stage.
        myStage.setScene(myScene);
// Create a label.
        response = new Label("Push a Button");
// Create two push buttons.
        Button btnAlpha = new Button("Alpha");
        Button btnBeta = new Button("Beta");
// Handle the action events for the Alpha button.
        btnAlpha.setOnAction(ae -> response.setText("Alpha was pressed."));
// Handle the action events for the Beta button.
        btnBeta.setOnAction(ae -> response.setText("Beta was pressed."));
// Add the label and buttons to the scene graph.
        rootNode.getChildren().addAll(btnAlpha, btnBeta, response);
// Show the stage and its scene.
        myStage.show();
    }
    public void stop() {
    }
}

