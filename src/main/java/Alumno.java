import java.util.HashSet;
import java.util.Set;

public class Alumno {
    private String nombre;
    private String apellido;
    private Set<Materia> materiasAprobadas;

    //CONSTRUCTORES, GETTER Y SETTER
    public Alumno() {materiasAprobadas = new HashSet<>();}

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public Set<Materia> getMateriasAprobadas() {return materiasAprobadas;}

    public void setMateriasAprobadas(Set<Materia> materiasAprobadas) {this.materiasAprobadas = materiasAprobadas;}

    public String getApellido() {return apellido;}

    public void setApellido(String apellido) {this.apellido = apellido;}

    //METODOS
    public boolean puedeCursar(Materia materia) {
        return materia.cumpleCorrelativas(this.getMateriasAprobadas());
    }

    public void aprobarMateria(Materia materia) {
        materiasAprobadas.add(materia);
    }
}

