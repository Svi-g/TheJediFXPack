package com.example.thejedifxpack;
// Demonstrate Menus
import javafx.application.*;
import javafx.scene.*;
import javafx.scene.image.ImageView;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
//import javafx.geometry.*;
import javafx.scene.input.*;


public class MenuDemo extends Application {
    Label response;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage myStage) {
        // Give the stage a title.
        myStage.setTitle("Demonstrate Menus");
// Use a BorderPane for the root node.
        BorderPane rootNode = new BorderPane();
// Create a scene.
        Scene myScene = new Scene(rootNode, 300, 300);
// Set the scene on the stage.
        myStage.setScene(myScene);
// Create a label that will report the selection.
        response = new Label("Menu Demo");
// Create the menu bar.
        MenuBar mb = new MenuBar();
// Create the File menu.
        Menu fileMenu = new Menu("_File");
        MenuItem open = new MenuItem("Open");
        MenuItem close = new MenuItem("Close");
        MenuItem save = new MenuItem("Save");
        MenuItem exit = new MenuItem("Exit");
        fileMenu.getItems().addAll(open, close, save,
                new SeparatorMenuItem(), exit);
// Add File menu to the menu bar.
        mb.getMenus().add(fileMenu);
// Create the Options menu.
        Menu optionsMenu = new Menu("Options");
        // Create the Colors submenu.
        Menu colorsMenu = new Menu("Colors");
// Use check menu items for colors. This allows
// the user to select more than one color.
        CheckMenuItem red = new CheckMenuItem("Red");
        CheckMenuItem green = new CheckMenuItem("Green");
        CheckMenuItem blue = new CheckMenuItem("Blue");
        colorsMenu.getItems().addAll(red, green, blue);
        optionsMenu.getItems().add(colorsMenu);
// Select green for the default color selection.
        green.setSelected(true);
// Create the Priority submenu.
        Menu priorityMenu = new Menu("Priority");
// Use radio menu items for the priority setting.
// This lets the menu show which priority is used
// and also ensures that one and only one priority
// can be selected at any one time.
        RadioMenuItem high = new RadioMenuItem("High");
        RadioMenuItem low = new RadioMenuItem("Low");
// Create a toggle group and use it for the radio menu items.
        ToggleGroup tg = new ToggleGroup();
        high.setToggleGroup(tg);
        low.setToggleGroup(tg);
// Select High priority for the default selection.
        high.setSelected(true);
// Add the radio menu items to the Priority menu and
// add the Priority menu to the Options menu.
        priorityMenu.getItems().addAll(high, low);
        optionsMenu.getItems().add(priorityMenu);
// Add a separator.
        optionsMenu.getItems().add(new SeparatorMenuItem());
// Create the Reset menu item.
        MenuItem reset = new MenuItem("Reset");
        optionsMenu.getItems().add(reset);
// Add Options menu to the menu bar.
        mb.getMenus().add(optionsMenu);
        /*
// Create the Options menu.
        Menu optionsMenu = new Menu("_Options");
// Create the Colors submenu.
        Menu colorsMenu = new Menu("_Colors");
        MenuItem red = new MenuItem("Red");
        MenuItem green = new MenuItem("Green");
        MenuItem blue = new MenuItem("Blue");
        colorsMenu.getItems().addAll(red, green, blue);
        optionsMenu.getItems().add(colorsMenu);
// Create the Priority submenu.
        Menu priorityMenu = new Menu("Priority");
        MenuItem high = new MenuItem("High");
        MenuItem low = new MenuItem("Low");
        priorityMenu.getItems().addAll(high, low);
        optionsMenu.getItems().add(priorityMenu);
// Add a separator.
        optionsMenu.getItems().add(new SeparatorMenuItem());

// Create the Reset menu item.
        MenuItem reset = new MenuItem("Reset");
        optionsMenu.getItems().add(reset);
// Add Options menu to the menu bar.
        mb.getMenus().add(optionsMenu);
 */
// Create the Help menu.
        Menu helpMenu = new Menu("Help");
        ImageView aboutIV = new ImageView("AboutIcon.png");
        MenuItem about = new MenuItem("About", aboutIV);
        helpMenu.getItems().add(about);
// Add Help menu to the menu bar.
        mb.getMenus().add(helpMenu);
// Create one event handler that will handle menu action events.
        EventHandler<ActionEvent> MEHandler =
                ae -> {
                    String name = ((MenuItem)ae.getTarget()).getText();
// If Exit is chosen, the program is terminated.
                    if(name.equals("Exit")) Platform.exit();
                    response.setText( name + " selected");
                };
// Set action event handlers for the menu items.
        open.setOnAction(MEHandler);
        close.setOnAction(MEHandler);
        save.setOnAction(MEHandler);
        exit.setOnAction(MEHandler);
        red.setOnAction(MEHandler);
        green.setOnAction(MEHandler);
        blue.setOnAction(MEHandler);
        high.setOnAction(MEHandler);
        low.setOnAction(MEHandler);
        reset.setOnAction(MEHandler);
        about.setOnAction(MEHandler);


        // Add keyboard accelerators for the File menu.
        open.setAccelerator(KeyCombination.keyCombination("shortcut+O"));
        close.setAccelerator(KeyCombination.keyCombination("shortcut+C"));
        save.setAccelerator(KeyCombination.keyCombination("shortcut+S"));
        exit.setAccelerator(KeyCombination.keyCombination("shortcut+E"));

// Add the menu bar to the top of the border pane and
// the response label to the center position.
        rootNode.setTop(mb);
        rootNode.setCenter(response);
// Show the stage and its scene.
        myStage.show();
    }
    @Override
    public void stop() {
    }
}
