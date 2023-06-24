module com.example.game1010 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.game1010 to javafx.fxml;
    exports com.example.game1010;
}