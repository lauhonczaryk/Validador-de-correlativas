import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter

public class Inscripcion {
    private Set<Materia> materiasSolicitadas;
    @Setter
    private Boolean aprobada;
    @Setter
    private Alumno alumno;

    //CONSTRUCTORES, GETTER Y SETTER
    public Inscripcion() {this.materiasSolicitadas = new HashSet<>();}

    public Set<Materia> getMateriasSolicitadas() {return materiasSolicitadas;}

    public void setMateriasACursar(Set<Materia> materiasSolicitadas) {this.materiasSolicitadas = materiasSolicitadas;}

    public Alumno getAlumno() {return alumno;}

    public Boolean getAprobada() {return aprobada;}

    //METODOS
    public boolean aprobada() {
        return (getMateriasSolicitadas().stream().allMatch(materia -> getAlumno().puedeCursar(materia)));
    }

    public void agregarMateriaSolicitada(Materia materia) {
        materiasSolicitadas.add(materia);
    }
}






