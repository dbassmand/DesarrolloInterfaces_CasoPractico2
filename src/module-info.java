module ReservaEvento2 {
    requires javafx.controls;
    requires javafx.fxml;
	requires jdk.incubator.vector;
	requires junit;
	requires org.junit.jupiter.api;

    opens application to javafx.graphics, javafx.fxml;  // Abre el paquete de la aplicación
    opens vista to javafx.graphics, javafx.fxml;        // Abre el paquete de vista
    opens controlador to javafx.fxml;                  // Abre el paquete controlador para FXML

    exports controlador;                               // Asegura que el paquete controlador esté exportado
}
