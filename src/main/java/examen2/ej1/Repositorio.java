package examen2.ej1;

import java.util.HashMap;
import java.util.Map;

public class Repositorio {
    private Map<String,Memento> versiones= new HashMap<>();
    private int index = 1;
    private int sizeAnterior = 0;


    public void createSave(Memento m){
        // System.out.println("El size e de esta es: "+ (m.getTexto().getTexto().split(" ").length - sizeAnterior));
        if(m.getTexto().getTexto().split(" ").length - sizeAnterior >= 5){
            versiones.put("version"+index,m);
            index++;
            sizeAnterior = m.getTexto().getTexto().split(" ").length;
        }
    }

    public Memento getSave(String formato){
        return versiones.get(formato);
    }
}
