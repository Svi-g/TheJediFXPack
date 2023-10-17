package com.example.thejedifxpack;
// Demonstrate an image in a label.

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.*;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class LabelImageDemo extends Application {
    public LabelImageDemo() {

    }

    public static void main(String... args) {
        launch(args);
    }

    @Override
    public void start(Stage myStage) {
        myStage.setTitle("Use an Image in a Label");

        // Use a FlowPane for the root node.
        FlowPane rootNode = new FlowPane();
        // Use center alignment.
        rootNode.setAlignment(Pos.CENTER);

        // Create a scene.
        Scene myScene = new Scene(rootNode, 300, 200);
        myStage.setScene(myScene);

        // Create an ImageView and handle image loading errors.
        ImageView hourglassIV = createImageView();
        if (hourglassIV != null) {
            // Create a label that contains both an image and text.
            Label hourglassLabel = new Label("Hourglass", hourglassIV);
            // set the display of the image
            hourglassLabel.setContentDisplay(ContentDisplay.TOP);
            // Add the label to the scene graph.
            rootNode.getChildren().add(hourglassLabel);
        }

        // Show the stage and its scene.
        myStage.show();
    }

    private ImageView createImageView() {
        try {
            // Load the image from the provided path.
            Image image = new Image("file:" + "/Users/siviwematho/Documents/GitHub/IdeaProjects/TheJediPack/Hourglass.png");
            return new ImageView(image);
        } catch (Exception e) {
            System.err.println("Error loading image: " + e.getMessage());
            return null;
        }
    }

    @Override
    public void stop() {
    }
}
