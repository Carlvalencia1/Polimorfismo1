module com.adr.polimorfismo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.valencia.polimorfismo.models to javafx.base;
    opens com.valencia.polimorfismo to javafx.fxml;
    exports com.valencia.polimorfismo;
    exports com.valencia.polimorfismo.controllers;
    opens com.valencia.polimorfismo.controllers to javafx.fxml;
}