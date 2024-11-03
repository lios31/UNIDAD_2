package uni1a;

import java.util.ArrayList;
import java.util.List;

public class Bibliotecadesubclases {
    private List<ContenidoAudiovisual> contenidos;

    public Bibliotecadesubclases() {
        contenidos = new ArrayList<>();
    }

    public void agregarContenido(ContenidoAudiovisual contenido) {
        contenidos.add(contenido);
    }

    public void mostrarContenidos() {
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }
    }
}
