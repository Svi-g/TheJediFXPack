module com.example.thejedifxpack {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires javafx.graphics;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires eu.hansolo.fx.countries;
    requires eu.hansolo.fx.heatmap;
    requires com.almasb.fxgl.all;

    opens com.example.thejedifxpack to javafx.fxml;
    exports com.example.thejedifxpack; // Export the package com.example.thejedifxpack
}
