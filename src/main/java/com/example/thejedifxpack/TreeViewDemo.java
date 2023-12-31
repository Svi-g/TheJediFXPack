package com.example.thejedifxpack;
// Demonstrate a TreeView
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.beans.value.*;
import javafx.geometry.*;
public class TreeViewDemo extends Application {
    Label response;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage myStage) {
        myStage.setTitle("Demonstrate a TreeView");
// Use a FlowPane for the root node. In this case,
// vertical and horizontal gaps of 10.
        FlowPane rootNode = new FlowPane(10, 10);
// Center the controls in the scene.
        rootNode.setAlignment(Pos.CENTER);
// Create a scene.
        Scene myScene = new Scene(rootNode, 310, 460);
// Set the scene on the stage.
        myStage.setScene(myScene);
        // Create a label that will report the state of the
// selected tree item.
        response = new Label("No Selection");
// Create tree items, starting with the root.
        TreeItem<String> tiRoot = new TreeItem<>("Food");
// Now add subtrees, beginning with fruit.
        TreeItem<String> tiFruit = new TreeItem<>("Fruit");
// Construct the Apple subtree.
        TreeItem<String> tiApples = new TreeItem<>("Apples");
// Add child nodes to the Apple node.
        tiApples.getChildren().add(new TreeItem<>("Fuji"));
        tiApples.getChildren().add(new TreeItem<>("Winesap"));
        tiApples.getChildren().add(new TreeItem<>("Jonathan"));
// Add varieties to the fruit node.
        tiFruit.getChildren().add(tiApples);
        tiFruit.getChildren().add(new TreeItem<>("Pears"));
        tiFruit.getChildren().add(new TreeItem<>("Oranges"));
// Finally, add the fruit node to the root.
        tiRoot.getChildren().add(tiFruit);
// Now, add vegetables subtree, using the same general process.
        TreeItem<String> tiVegetables = new TreeItem<>("Vegetables");
        tiVegetables.getChildren().add(new TreeItem<>("Corn"));
        tiVegetables.getChildren().add(new TreeItem<>("Peas"));
        tiVegetables.getChildren().add(new TreeItem<>("Broccoli"));
        tiVegetables.getChildren().add(new TreeItem<>("Beans"));
        tiRoot.getChildren().add(tiVegetables);
// Likewise, add nuts subtree.
        TreeItem<String> tiNuts = new TreeItem<>("Nuts");
        tiNuts.getChildren().add(new TreeItem<>("Walnuts"));
        tiNuts.getChildren().add(new TreeItem<>("Peanuts"));
        tiNuts.getChildren().add(new TreeItem<>("Pecans"));
        tiRoot.getChildren().add(tiNuts);
// Create tree view using the tree just created.
        TreeView<String> tvFood = new TreeView<>(tiRoot);
// Get the tree view selection model.
        MultipleSelectionModel<TreeItem<String>> tvSelModel =
                tvFood.getSelectionModel();
// Use a change listener to respond to a selection within
// a tree view
        tvSelModel.selectedItemProperty().addListener(
                (changed, oldVal, newVal) -> {
                    // Display the selection and its complete path from the root.
                    if(newVal != null) {
// Construct the entire path to the selected item.
                        String path = newVal.getValue();
                        TreeItem<String> tmp = newVal.getParent();
                        while(tmp != null) {
                            path = tmp.getValue() + " -> " + path;
                            tmp = tmp.getParent();
                        }
// Display the selection and the entire path.
                        response.setText("Selection is " + newVal.getValue() +
                                "\nComplete path is " + path);
                    }
                });
// Add controls to the scene graph.
        rootNode.getChildren().addAll(tvFood, response);
// Show the stage and its scene.
        myStage.show();
    }
    @Override
    public void stop() {
    }
}
