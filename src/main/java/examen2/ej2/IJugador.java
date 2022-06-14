package examen2.ej2;

public interface IJugador {
    String getAlias();
    String getNombre();
    String getRanking();

    void receive(String s, IJugador sender);

}
