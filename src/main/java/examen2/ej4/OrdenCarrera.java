package examen2.ej4;

public class OrdenCarrera implements ICategoria{
    @Override
    public Estudiante[] ordenar(Estudiante[] estudiantes) {
        String[] carrera = new String[estudiantes.length];
        for (int i = 0; i < estudiantes.length; i++){
            carrera[i] = estudiantes[i].getCarrera();
        }
        int n = estudiantes.length;
        String temp;
        Estudiante tempe;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(carrera[j-1].toCharArray()[0] > carrera[j].toCharArray()[0]){
                    temp = carrera[j-1];
                    carrera[j-1] = carrera[j];
                    carrera[j] = temp;

                    tempe = estudiantes[j-1];
                    estudiantes[j-1] = estudiantes[j];
                    estudiantes[j] = tempe;
                }
            }
        }
        for (int i = 0; i < n; ++i){
            System.out.print(carrera[i] + " ");
        }
        System.out.println();
        return estudiantes;
    }
}
