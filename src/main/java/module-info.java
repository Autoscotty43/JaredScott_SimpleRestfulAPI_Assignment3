module ca.nscc.jaredscott_restfulapi_jellostore {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens ca.nscc.jaredscott_restfulapi_jellostore to javafx.fxml;
    exports ca.nscc.jaredscott_restfulapi_jellostore;
}