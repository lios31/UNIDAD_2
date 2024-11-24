package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import uni1a.ContenidoAudiovisual;

class ContenidoAudiovisual_test {

    @Test
    public void testConstructor() {
        ContenidoAudiovisual contenido = ContenidoAudiovisual("Inception", "Sci-Fi", 120);
        assertEquals("Inception", contenido.getTitulo());
        assertEquals("Sci-Fi", contenido.getGenero());
        assertEquals(120, contenido.getDuracionEnMinutos());
    }

    private ContenidoAudiovisual ContenidoAudiovisual(String string, String string2, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Test
    public void testSetters() {
        ContenidoAudiovisual contenido = ContenidoAudiovisual("Avatar", "Fantasy", 150);
        contenido.setTitulo("Avatar 2");
        contenido.setGenero("Sci-Fi");
        contenido.setDuracionEnMinutos(180);

        assertEquals("Avatar 2", contenido.getTitulo());
        assertEquals("Sci-Fi", contenido.getGenero());
        assertEquals(180, contenido.getDuracionEnMinutos());
    }
}
