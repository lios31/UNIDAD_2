package uni1a;

public class Tutorial extends ContenidoAudiovisual {
    private String instructor;
    private String nivel;

    public Tutorial(String titulo, int duracionEnMinutos, String genero, String instructor, String nivel) {
        super(titulo, duracionEnMinutos, genero);
        this.instructor = instructor;
        this.nivel = nivel;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public void mostrarDetalles() {
        
        System.out.println("Instructor: " + instructor);
        System.out.println("Nivel: " + nivel);
    }
}
