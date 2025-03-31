import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest1 {
    @Test
    public void resultadoInscripcionPositivo() {
        Materia pdp = new Materia();
        pdp.setNombre("Paradigmas de Programacion");

        Materia ads = new Materia();
        ads.setNombre("Analisis de Sistemas de Informacion");

        Materia ddsi = new Materia();
        ddsi.setNombre("Disenio de Sistemas de Informacion");
        ddsi.agregarCorrelativa(pdp);
        ddsi.agregarCorrelativa(ads);

        Alumno alumno = new Alumno();
        alumno.setNombre("Laura");
        alumno.setApellido("Honczaryk");
        alumno.aprobarMateria(pdp);
        alumno.aprobarMateria(ads);

        Inscripcion inscripcion = new Inscripcion();
        inscripcion.setAlumno(alumno);
        inscripcion.agregarMateriaSolicitada(ddsi);

        Assertions.assertEquals(true, inscripcion.aprobada());

    }
}

class InscripcionTest2 {
    @Test
    public void resultadoInscripcionNegativo() {
        Materia pdp = new Materia();
        pdp.setNombre("Paradigmas de Programacion");

        Materia ads = new Materia();
        ads.setNombre("Analisis de Sistemas de Informacion");

        Materia ddsi = new Materia();
        ddsi.setNombre("Disenio de Sistemas de Informacion");
        ddsi.agregarCorrelativa(pdp);
        ddsi.agregarCorrelativa(ads);

        Alumno alumno = new Alumno();
        alumno.setNombre("Laura");
        alumno.setApellido("Honczaryk");
        alumno.aprobarMateria(pdp);

        Inscripcion inscripcion = new Inscripcion();
        inscripcion.setAlumno(alumno);
        inscripcion.agregarMateriaSolicitada(ddsi);

        Assertions.assertEquals(false, inscripcion.aprobada());

    }
}