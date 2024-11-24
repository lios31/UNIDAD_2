package Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ContenidoAudiovisualManager.archivos.Vista;

import uni1a.ContenidoAudiovisual;
import uni1a.Pelicula;
import uni1a.SerieDeTV;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Controlador_test {

    private Controlador_test controlador;
    private Vista vistaMock;
    private List<ContenidoAudiovisual> contenidos;

    public Controlador_test(Vista vistaMock2, List<ContenidoAudiovisual> contenidos2) {
		// TODO Auto-generated constructor stub
	}

	@BeforeEach
    public void setUp() {
        // Crear un mock de la clase Vista
        vistaMock = new Vista() {
            public void mostrarMenu() {
                System.out.println("Menú mostrado");
            }
        };

        // Inicializar lista de contenidos con datos ficticios
        contenidos = new ArrayList<>();
        contenidos.add(new Pelicula("Pelicula 1", 120, "Acción", "Director 1"));
        contenidos.add(new SerieDeTV("Serie 1", 60, "Drama", 3));

        // Crear la instancia del controlador
        controlador = new Controlador_test(vistaMock, contenidos);
    }

    @Test
    public void testMostrarMenu() {
        // Llamar al método mostrarMenu y verificar que no genera errores
        assertDoesNotThrow(() -> Vista.mostrarMenu(), "El método mostrarMenu no debe lanzar excepciones.");
    }

    @Test
    public void testContenidoInicializadoCorrectamente() {
        // Verificar que la lista de contenidos fue inicializada correctamente
        assertNotNull(controlador.getContenidos(), "La lista de contenidos no debe ser nula.");
        assertEquals(2, controlador.getContenidos().size(), "Debe haber 2 contenidos iniciales en la lista.");
    }

    @Test
    public void testAgregarContenido() {
        // Agregar un nuevo contenido al controlador
        controlador.agregarContenido(new Pelicula("Pelicula 2", 90, "Comedia", "Director 2"));

        // Verificar que el contenido fue agregado correctamente
        assertEquals(3, controlador.getContenidos().size(), "Debe haber 3 contenidos después de agregar uno nuevo.");
    }

    private void agregarContenido(Pelicula pelicula) {
		// TODO Auto-generated method stub
		
	}

	private List<ContenidoAudiovisual> getContenidos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Test
    public void testBuscarContenidoPorTitulo() {
        // Buscar un contenido existente
        ContenidoAudiovisual contenido = controlador.buscarContenidoPorTitulo("Pelicula 1");

        // Verificar que el contenido encontrado es correcto
        assertNotNull(contenido, "Debe encontrar el contenido con el título 'Pelicula 1'.");
        assertEquals("Pelicula 1", contenido.getTitulo(), "El título del contenido encontrado debe coincidir.");
    }

    @Test
    public void testBuscarContenidoPorTituloInexistente() {
        // Intentar buscar un contenido que no existe
        ContenidoAudiovisual contenido = controlador.buscarContenidoPorTitulo("Contenido Inexistente");

        // Verificar que no encontró ningún contenido
        assertNull(contenido, "No debe encontrar un contenido inexistente.");
    }

	private ContenidoAudiovisual buscarContenidoPorTitulo(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
