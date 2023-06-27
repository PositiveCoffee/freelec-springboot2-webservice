module com.jojodu.book.freelecspringboot2webservice {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.jojodu.book.freelecspringboot2webservice to javafx.fxml;
    exports com.jojodu.book.freelecspringboot2webservice;
}