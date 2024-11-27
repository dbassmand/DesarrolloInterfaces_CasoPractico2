package controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReservaController {

    // Declaramos los campos de texto asociados a los elementos en el archivo FXML
    @FXML
    private TextField nombre;
    @FXML
    private TextField apellido1;
    @FXML
    private TextField apellido2;
    @FXML
    private TextField empresa;
    @FXML
    private TextField email;
    @FXML
    private TextField numeroacompanantes;
    @FXML
    private TextField observaciones;

    @FXML
    private Button guardarButton;

    // Evento que se ejecutará al hacer clic en el botón "Guardar"
    @FXML
    private void handleGuardar(ActionEvent event) {
        // Verificación de que los campos no están vacíos
        if (camposVacios()) {
            mostrarAlerta("Error", "Por favor, completa todos los campos.");
            return;
        }

        // Verificación del formato del correo electrónico
        if (!compruebaMail(email.getText())) {
            mostrarAlerta("Error", "El correo electrónico no tiene el formato correcto.");
            return;
        }

        // Mostrar los datos introducidos en la consola
        mostrarDatosEnConsola();

        // Limpiar los campos después de procesar la información
        limpiarCampos();

        // Aquí puedes continuar con la lógica para guardar la información si lo necesitas
        System.out.println("Formulario enviado correctamente.");
    }

    // Método para verificar si algún campo está vacío
    private boolean camposVacios() {
        return nombre.getText().isEmpty() || apellido1.getText().isEmpty() || apellido2.getText().isEmpty()
                || empresa.getText().isEmpty() || email.getText().isEmpty() || numeroacompanantes.getText().isEmpty()
                || observaciones.getText().isEmpty();
    }

    // Método para verificar si el correo electrónico tiene el formato correcto
    public boolean compruebaMail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    // Método para mostrar una alerta con un mensaje
    private void mostrarAlerta(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    // Método para mostrar los datos en la consola
    private void mostrarDatosEnConsola() {
        System.out.println("\nNombre: " + nombre.getText());
        System.out.println("Apellido 1: " + apellido1.getText());
        System.out.println("Apellido 2: " + apellido2.getText());
        System.out.println("Empresa: " + empresa.getText());
        System.out.println("Email: " + email.getText());
        System.out.println("Número de acompañantes: " + numeroacompanantes.getText());
        System.out.println("Observaciones: " + observaciones.getText());
    }

    // Método para limpiar los campos
    private void limpiarCampos() {
        nombre.clear();
        apellido1.clear();
        apellido2.clear();
        empresa.clear();
        email.clear();
        numeroacompanantes.clear();
        observaciones.clear();
    }
}
