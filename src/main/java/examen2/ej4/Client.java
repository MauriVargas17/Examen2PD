package examen2.ej4;

public class Client {
    public static void main(String[] args){


        Estudiante e1 = new Estudiante(1234, "Jose", "2001", "ICO");
Estudiante e2 = new Estudiante(5646, "Pedro", "2001", "FIN");
Estudiante e3 = new Estudiante(3453, "Roberto", "2002", "ICO");
Estudiante e4 = new Estudiante(1245, "Mario", "2001", "DER");
Estudiante e5 = new Estudiante(9976, "Juan", "2003", "SIS");
Estudiante e6 = new Estudiante(4646, "Armando", "2001", "SIS");

        Estudiante[] estudiantes = {e1,e2,e3,e4,e5,e6};

        Escuela escuela = new Escuela(estudiantes);

        escuela.setStrategy(new OrdenCi());
        escuela.setEstudiantes(escuela.ordenar());
        escuela.showEstudiantes();


        escuela.setStrategy(new OrdenNombre());
        escuela.setEstudiantes(escuela.ordenar());
        escuela.showEstudiantes();

        escuela.setStrategy(new OrdenCarrera());
        escuela.setEstudiantes(escuela.ordenar());
        escuela.showEstudiantes();



    }
}
