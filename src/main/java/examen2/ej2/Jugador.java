package examen2.ej2;

public class Jugador implements IJugador{
    private String alias;
    private String nombre;
    private String ranking;
    private IChat chat;

    public Jugador(String alias, String nombre, String ranking, IChat chat) {
        this.alias = alias;
        this.nombre = nombre;
        this.ranking = ranking;
        this.chat = chat;
    }

    public void send(String msg){
        chat.send(msg, this, null, "");
    }

    public void send(String msg, IJugador receptor){
        chat.send(msg, this, receptor, "");
    }

    public void sendAll(String msg, String sala){
        chat.send(msg, this, null, sala);
    }

    public void receive(String msg, IJugador sender){
        System.out.println(nombre+" received: "+msg+" from: "+sender.getNombre());
    }

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
