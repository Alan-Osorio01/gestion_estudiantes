package Capa_presentacion;

import Capa_logica.GestionEstudiantes;

public class GestorEstudiantesSingleton {
    private static GestionEstudiantes gestionEstudiantesInstance;

    private GestorEstudiantesSingleton() {} // Constructor privado para evitar la creación de instancias

    public static GestionEstudiantes obtenerInstancia() {
        if (gestionEstudiantesInstance == null) {
            gestionEstudiantesInstance = new GestionEstudiantes();
        }
        return gestionEstudiantesInstance;
    }
}
