package logic;

import java.util.ArrayList;  //Con esta libreria puedo usar el metodo Array.toString

public class GestorAlumnos {

    private ArrayList<Alumno> listaAlumnos; // Lista para almacenar a los alumnos

    public GestorAlumnos() {
        listaAlumnos = new ArrayList<>(); // Inicializa el constructor
    }

    public void agregarAlumno(Alumno alumno) {
        listaAlumnos.add(alumno);
        System.out.println("Alumno agregado correctamente");
    }

    public void mostrarAlumnos() {
        if (listaAlumnos.isEmpty()) {
            System.out.println("No hay ningun alumno registrado");
            return;
        }

        for (Alumno alumno : listaAlumnos) {
            System.out.println("ID: " + alumno.getId() + ", Nombre: " + alumno.getNombre() + " " + alumno.getApellido());
            System.out.println("Calificaciones: " + java.util.Arrays.toString(alumno.getCalificaciones()));
            System.out.println("Promedio: " + alumno.getPromedio());
            alumno.saberAprobado();
            System.out.println("-------------------------");
        }
    }

    public Alumno buscarAlumno(int id) {
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getId() == id) {
                return alumno;
            }
        }
        return null; // Retorna null si no encuentra el alumno
    }

}
