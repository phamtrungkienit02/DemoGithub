module com.ptk.ibm {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.ptk.ibm to javafx.fxml;
    exports com.ptk.ibm;
}
