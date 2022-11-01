module com.example.cerses {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cerses to javafx.fxml;
    exports com.example.cerses;
}