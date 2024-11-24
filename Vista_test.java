package Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class Vista_test {

    private Vista_test vista;
    private static ByteArrayOutputStream outputStream;

    @BeforeEach
    public void setUp() {
        // Inicializar el flujo de salida simulado
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public static void testMostrarMenu() {
        // Llamar al método mostrarMenu
        Vista_test.testMostrarMenu();

        // Verificar que el menú se imprimió correctamente
        String salidaEsperada = """
                ==== Menú Principal ====
                1. Mostrar contenido
                2. Agregar contenido
                3. Buscar contenido
                4. Salir
                ========================
                """;
        assertEquals(salidaEsperada.trim(), outputStream.toString().trim(), "El menú mostrado debe coincidir con el esperado.");
    }

    @Test
    public static int testPedirEntradaUsuario() {
        // Simular la entrada del usuario
        String entradaSimulada = "1\n";
        System.setIn(new ByteArrayInputStream(entradaSimulada.getBytes()));

        // Llamar al método para capturar la entrada
        int opcion = Vista_test.testPedirEntradaUsuario();

        // Verificar que se capturó la entrada correcta
        assertEquals(1, opcion, "La entrada del usuario debe ser 1.");
		return opcion;
    }

    @Test
    public void testMostrarMensaje() {
        // Llamar al método mostrarMensaje
        Vista_test.mostrarMensaje("Prueba de mensaje");

        // Verificar que el mensaje se imprimió correctamente
        assertEquals("Prueba de mensaje", outputStream.toString().trim(), "El mensaje mostrado debe coincidir con el esperado.");
    }

	private static void mostrarMensaje(String string) {
		// TODO Auto-generated method stub
		
	}
}
