module com.example.calculatorbyklepikov {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calculatorbyklepikov to javafx.fxml;
    exports com.example.calculatorbyklepikov;
}