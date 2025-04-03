package logic;

public class Alumno {
//Declaro variables

    private int id;
    private String nombre;
    private String apellido;
    private double[] calificaciones;
//Constructor vacio en caso de no poner nada en parametros

    public Alumno() {
    }
//Creo el constructor

    public Alumno(int id, String nombre, String apellido, double[] calificaciones) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.calificaciones = calificaciones;

    }
//get y set de cada variable para llamarlas mas adelante

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double[] getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(double[] calificaciones) {
        this.calificaciones = calificaciones;
    }

    public double getPromedio() {
        if (calificaciones == null || calificaciones.length == 0) {
            return 0; //Si no hay calificaciones retorna 0 
        }
        double suma = 0;
        for (double calificacion : calificaciones) {

            suma += calificacion;
        }
        return suma / calificaciones.length;
    }

    public void mostrarNombre() {

        System.out.println("Hola soy " + nombre + " " + apellido);
    }

    public void saberAprobado() {

        if (getPromedio() >= 3) {
            System.out.println("Aprobe la materia");
        } else {
            System.out.println("No aprobe la materia");
        }

    }
}
