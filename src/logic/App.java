package logic;

import Pages.Login;
import Pages.Principal;
import java.util.Scanner;

public class App {
    
 

    public static void main(String[] args) {
        
        Login v1 = new Login();
        v1.setVisible(true);
        v1.setLocationRelativeTo(null);
//            Scanner scanner = new Scanner(System.in);
//        GestorAlumnos gestor = new GestorAlumnos(); // Creao el gestor de alumnos
//        while (true) {
//            System.out.println("\nMenu:");
//            System.out.println("1)Agregar Alumno");
//            System.out.println("2)Mostrar Alumnos");
//            System.out.println("3)Buscar Alumno por ID");
//            System.out.println("4)Salir");
//            System.out.print("Seleccione una opcion: ");
//
//            int opcion = scanner.nextInt();
//            scanner.nextLine();
//
//            switch (opcion) {
//                case 1:
//                    System.out.print("Ingrese ID del alumno: ");
//                    int id = scanner.nextInt();
//                    scanner.nextLine();
//
//                    System.out.print("Ingrese nombre del alumno: ");
//                    String nombre = scanner.nextLine();
//
//                    System.out.print("Ingrese apellido del alumno: ");
//                    String apellido = scanner.nextLine();
//
//                    System.out.print("Cuantas calificaciones desea ingresar? ");
//                    int numNotas = scanner.nextInt();
//                    double[] calificaciones = new double[numNotas];
//
//                    for (int i = 0; i < numNotas; i++) {
//                        System.out.print("Ingrese calificación " + (i + 1) + ": ");
//                        calificaciones[i] = scanner.nextDouble();
//                    }
//
//                    Alumno nuevoAlumno = new Alumno(id, nombre, apellido, calificaciones);
//                    gestor.agregarAlumno(nuevoAlumno);
//                    break;
//
//                case 2:
//                    gestor.mostrarAlumnos();
//                    break;
//                case 3:
//                    System.out.print("Ingrese el ID del alumno a buscar: ");
//                    int idBuscar = scanner.nextInt();
//                    Alumno alumnoEncontrado = gestor.buscarAlumno(idBuscar);
//
//                    if (alumnoEncontrado != null) {
//                        System.out.println("\nAlumno encontrado:");
//                        System.out.println("ID: " + alumnoEncontrado.getId());
//                        System.out.println("Nombre completo: " + alumnoEncontrado.getNombre() + " " + alumnoEncontrado.getApellido());
//                        System.out.println("Calificaciones: " + java.util.Arrays.toString(alumnoEncontrado.getCalificaciones()));
//                        System.out.println("Promedio: " + alumnoEncontrado.getPromedio());
//                        alumnoEncontrado.saberAprobado();
//                    } else {
//                        System.out.println("Alumno no encontrado.");
//                    }
//                    break;
//
//                case 4:
//                    System.out.println("Usted a salido del programa");
//                    scanner.close();
//                    return;
//
//                default:
//                    System.out.println("Opcion no valida.");
//            }
//        }
    }
}
