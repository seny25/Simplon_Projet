module com.brief8{
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.brief8 to javafx.controls;
    exports com.example.brief8;

}

