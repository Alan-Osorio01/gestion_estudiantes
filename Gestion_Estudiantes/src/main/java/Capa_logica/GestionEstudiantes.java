
package Capa_logica;
import java.util.HashMap;
import Capa_datos.Estudiantes;

public class GestionEstudiantes {
    private HashMap<Integer, Estudiantes> estudiantes;

    public GestionEstudiantes() {
        estudiantes = new HashMap<>();
    }

    // Métodos para la gestión de estudiantes
    public void agregarEstudiante(int codigo, Estudiantes estudiante) {
        estudiantes.put(codigo, estudiante);
    }

    public Estudiantes consultarEstudiante(int codigo) {
        return estudiantes.get(codigo);
    }

    public void modificarEstudiante(int codigo, Estudiantes estudiante) {
        if (estudiantes.containsKey(codigo)) {
            estudiantes.put(codigo, estudiante);
        }
    }

    public void eliminarEstudiante(int codigo) {
        estudiantes.remove(codigo);
    }
    
    public boolean existeEstudiante(int codigo) {
        return estudiantes.containsKey(codigo);
    }

}
