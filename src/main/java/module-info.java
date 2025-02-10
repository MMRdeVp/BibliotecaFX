module org.example.bibliotecafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires org.hibernate.orm.core;
    requires jakarta.persistence;
    requires java.naming;
    requires mysql.connector.j;

    opens org.example.bibliotecafx to javafx.fxml,org.hibernate.orm.core;
    opens org.example.bibliotecafx.entities to javafx.fxml,org.hibernate.orm.core;
    exports org.example.bibliotecafx;
}