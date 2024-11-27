package test;

import controlador.ReservaController;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReservaControllerTest {

    // Crear una instancia del controlador
    ReservaController controller = new ReservaController();

    @Test
    public void testCorreoValido() {
        // Probar un correo válido
        String correoValido = "test@dominio.com";
        assertTrue(controller.compruebaMail(correoValido), "El correo debería ser válido.");
    }

    @Test
    public void testCorreoInvalido() {
        // Probar un correo inválido
        String correoInvalido = "test@dominio";
        assertFalse(controller.compruebaMail(correoInvalido), "El correo debería ser inválido.");
    }
}

