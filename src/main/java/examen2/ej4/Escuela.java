package examen2.ej4;

public class Escuela {
    Estudiante[] estudiantes;
    ICategoria strategy;

    public Escuela(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    public void setEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    public void setStrategy(ICategoria strategy) {
        this.strategy = strategy;
    }

    public Estudiante[] ordenar(){
       return strategy.ordenar(estudiantes);
    }

    public void showEstudiantes(){
        for (Estudiante e: estudiantes){
            System.out.println(e.getNombre());
        }
    }
}
