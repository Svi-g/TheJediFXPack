package com.example.thejedifxpack;
// Load and display an image.

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.geometry.*;
import javafx.scene.image.*;

public class ImageDemo extends Application {

    public ImageDemo() {
    }

    public static void main(String... args) {

        launch(args);
    }

    @Override
    public void start(Stage myStage) {
        // Give the stage a title.
        myStage.setTitle("Display an Image");
// Use a FlowPane for the root node.
        FlowPane rootNode = new FlowPane();
// Use center alignment.
        rootNode.setAlignment(Pos.CENTER);
// Create a scene.
        Scene myScene = new Scene(rootNode, 300, 200);
        // Set the scene on the stage.
        myStage.setScene(myScene);
// Create an image.
        Image hourglass = new Image("Hourglass.png");
// Create an image view that uses the image.
        ImageView hourglassIV = new ImageView(hourglass);
// Add the image to the scene graph.
        rootNode.getChildren().add(hourglassIV);
// Show the stage and its scene.
        myStage.show();
    }
    @Override
    public void stop() {
    }
}
