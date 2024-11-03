package uni1a;

public class Cortometraje extends ContenidoAudiovisual {
    private String director;
    private boolean festivalPremios;

    public Cortometraje(String titulo, int duracionEnMinutos, String genero, String director, boolean festivalPremios) {
        super(titulo, duracionEnMinutos, genero);
        this.director = director;
        this.festivalPremios = festivalPremios;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public boolean isFestivalPremios() {
        return festivalPremios;
    }

    public void setFestivalPremios(boolean festivalPremios) {
        this.festivalPremios = festivalPremios;
    }

    @Override
    public void mostrarDetalles() {
        
        System.out.println("Director: " + director);
        System.out.println("Premiado en festivales: " + (festivalPremios ? "Sí" : "No"));
    }
}

