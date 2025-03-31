import java.util.HashSet;
import java.util.Set;

public class Materia {
    private String nombre;
    private Set<Materia> correlativas;

    //CONSTRUCTORES, GETTER Y SETTER
    public Materia() {correlativas = new HashSet<>();}

    public Set<Materia> getCorrelativas() {return correlativas;}

    public void setCorrelativas(Set<Materia> correlativas) {this.correlativas = correlativas;}

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    //METODOS
    public boolean cumpleCorrelativas(Set<Materia> materiasAprobadas) {
        return materiasAprobadas.containsAll(this.getCorrelativas());
    }

    public void agregarCorrelativa(Materia materia) {
        correlativas.add(materia);
    }
}


