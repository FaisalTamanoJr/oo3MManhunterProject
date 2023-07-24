module com.example.insight {
    requires javafx.controls;
    requires javafx.fxml;
            
                        requires org.kordamp.bootstrapfx.core;
            
    opens com.example.insight to javafx.fxml;
    exports com.example.insight;
}