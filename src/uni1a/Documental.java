/**
 * Class Documental
 */
package uni1a;

import java.util.ArrayList; // Importar ArrayList para manejar la lista
import java.util.List; // Importar List para la definición de la lista

// Subclase Documental que extiende de ContenidoAudiovisual
public class Documental extends ContenidoAudiovisual {
    private String tema;
    private List<Investigador> investigadores; // Atributo para almacenar la lista de investigadores

    // Constructor
    public Documental(String titulo, int duracionEnMinutos, String genero, String tema) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
        this.investigadores = new ArrayList<>(); // Inicializar la lista de investigadores
    }

    // Métodos para manejar investigadores
    public void agregarInvestigador(Investigador investigador) {
        investigadores.add(investigador); // Agregar investigador a la lista
    }

    public List<Investigador> getInvestigadores() {
        return investigadores; // Retornar la lista de investigadores
    }

    // Getters y Setters
    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del documental:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Tema: " + this.tema);
        System.out.print("Investigadores: ");
        for (Investigador investigador : investigadores) {
            System.out.print(investigador.getNombre() + " "); // Asumiendo que la clase Investigador tiene un método getNombre()
        }
        System.out.println("\n");
    }
}
