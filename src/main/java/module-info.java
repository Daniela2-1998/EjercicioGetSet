module com.example.ejerciciogetset {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.ejerciciogetset to javafx.fxml;
    exports com.example.ejerciciogetset;
}