module com.example.hw2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.hw2 to javafx.fxml;
    exports com.example.hw2;
}