/**
 * Class SerieDeTV
 */
package uni1a;

import java.util.ArrayList; // Importar ArrayList para manejar la lista
import java.util.List; // Importar List para la definición de la lista

// Subclase SerieDeTV que extiende de ContenidoAudiovisual
public class SerieDeTV extends ContenidoAudiovisual {
    private List<Temporada> temporadas; // Atributo para almacenar las temporadas

    // Constructor
    public SerieDeTV(String titulo, int duracionEnMinutos, String genero) {
        super(titulo, duracionEnMinutos, genero);
        this.temporadas = new ArrayList<>(); // Inicializar la lista de temporadas
    }

    // Método para agregar una temporada
    public void agregarTemporada(Temporada temporada) {
        temporadas.add(temporada); // Agregar temporada a la lista
    }

    public List<Temporada> getTemporadas() {
        return temporadas; // Retornar la lista de temporadas
    }

    // Getters y Setters
    public int getCantidadTemporadas() {
        return temporadas.size(); // Retornar la cantidad de temporadas
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la serie de TV:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Número de temporadas: " + getCantidadTemporadas());
        System.out.println();

        // Mostrar detalles de cada temporada
        for (Temporada temporada : temporadas) {
            System.out.println("Temporada: " + temporada.getNumero());
            System.out.println("Episodios: " + temporada.getEpisodios());
        }
        System.out.println();
    }
}
