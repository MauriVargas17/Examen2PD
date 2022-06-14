package examen2.ej2;

public class Docente implements IJugador{

    private String alias;
    private String nombre;
    private String ranking;

    @Override
    public String getAlias() {
        return alias;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getRanking() {
        return ranking;
    }
}
