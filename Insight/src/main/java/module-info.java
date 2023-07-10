module com.insight.insight {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.insight.insight to javafx.fxml;
    exports com.insight.insight;
}