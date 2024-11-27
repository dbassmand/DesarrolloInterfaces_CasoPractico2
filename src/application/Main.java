package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
//import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
            // Cargar el archivo FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/reserva.fxml"));
            
            // Crear la escena a partir del archivo FXML
            Scene scene = new Scene(loader.load(), 493, 508); // Tamaño de la ventana basado en el FXML
            
            // Establecer la escena
            primaryStage.setScene(scene);
            
            // Configurar el título de la ventana
            primaryStage.setTitle("Reserva de Evento");
            
            // Mostrar la ventana
            primaryStage.show();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
