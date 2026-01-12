module co.edu.uniquindio.proyectopersonal.redsocialproyecto {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.management;
    requires java.rmi;


    opens co.edu.uniquindio.proyectopersonal.redsocialproyecto to javafx.fxml;
    exports co.edu.uniquindio.proyectopersonal.redsocialproyecto;
}