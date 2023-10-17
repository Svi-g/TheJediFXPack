package com.example.thejedifxpack;
// Demonstrate a list view.

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.beans.value.*;
import javafx.collections.*;

public class ListViewDemo extends Application {
    Label response;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage myStage) {
// Give the stage a title.
        myStage.setTitle("ListView Demo");
// Use a FlowPane for the root node. In this case,
// vertical and horizontal gaps of 10.
        FlowPane rootNode = new FlowPane(10, 10);
// Center the controls in the scene.
        rootNode.setAlignment(Pos.CENTER);
// Create a scene.
        Scene myScene = new Scene(rootNode, 200, 120);
// Set the scene on the stage.
        myStage.setScene(myScene);
// Create a label.
        response = new Label("Select Transport Type");
// Create an ObservableList of entries for the list view.
        ObservableList<String> transportTypes =
                FXCollections.observableArrayList( "Train", "Car", "Airplane", "Bicycle", "Walking" );
// Create the list view.
        //Remember ListView uses MultipleSelectionModel even when a
        //single selection is allowed.
       final ListView<String> lvTransport = new ListView<>(transportTypes);
       // Set the preferred height and width.
        lvTransport.setPrefSize(80, 80);

        // Enable multiple-selection mode
        lvTransport.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        // Get the list view selection model.
        MultipleSelectionModel<String> lvSelModel = lvTransport.getSelectionModel();

        //Multiple-selection change listner
        lvSelModel.selectedItemProperty().addListener(
                (changed, oldVal, newVal) -> {
                    String selItems = "";
                    ObservableList<String> selected =
                            lvTransport.getSelectionModel().getSelectedItems();
                    // Display the selections.
                    for (String s : selected) selItems += "\n " + s;
                    response.setText("All transports selected: " + selItems);
                });

        /*
        // Use a change listener to respond to a change of selection within
        // a list view.
        lvSelModel.selectedItemProperty().addListener(
                (changed, oldVal, newVal) -> {
// Display the selection.
                    response.setText("Transport selected is " + newVal);
                });
         */
        // Add the label and list view to the scene graph.
        rootNode.getChildren().addAll(lvTransport, response);
// Show the stage and its scene.
        myStage.show();
    }
    @Override
    public void stop() {
    }
}
