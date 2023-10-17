package com.example.thejedifxpack;
// Demonstrate a toggle button ku JavaFX

import javafx.application.Application;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;
public class ToggleButtonDemo extends Application {
    ToggleButton tbOnOff;
    Label response;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage myStage) {
        // Give the stage a title.
        myStage.setTitle("Demonstrate a Toggle Button");
// Use a FlowPane for the root node. In this case,
// vertical and horizontal gaps of 10.
        FlowPane rootNode = new FlowPane(10, 10);
// Center the controls in the scene.
        rootNode.setAlignment(Pos.CENTER);
        //Scene myScene = new Scene(rootNode, 220, 120); // Create a scene.
// Create and Set the scene on the stage.
        myStage.setScene(new Scene(rootNode, 220, 120));
// Create a label.
        response = new Label("Push the Button.");
// Create the toggle button.
        tbOnOff = new ToggleButton("On/Off");
        // Handle action events for the toggle button.
        tbOnOff.setOnAction(ae -> {
            if(tbOnOff.isSelected()) response.setText("Button is on.");
            else response.setText("Button is off.");
        });
// Add the label and buttons to the scene graph.
        rootNode.getChildren().addAll(tbOnOff, response);
// Show the stage and its scene.
        myStage.show();
    }
    @Override
    public void stop() {
    }
}
