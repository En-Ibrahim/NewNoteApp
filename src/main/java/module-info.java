module org.guinoteapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.guinoteapp to javafx.fxml;
    exports org.guinoteapp;

}