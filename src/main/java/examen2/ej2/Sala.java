package examen2.ej2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sala implements IChat{
    List<IJugador> users = new ArrayList<>();
    Map<String, Sala> salas = new HashMap<>();

    public Sala addUser(IJugador jugador){
        users.add(jugador);
        return this;
    }

    public void setSalas(Map<String, Sala> salas) {
        this.salas = salas;
    }

    public void addSala(Sala sala, String nombreSala){
        salas.put(nombreSala, sala);
    }

    public void receiveBroadcast(String msg, IJugador sender){
        send(msg,sender, null, "");
    }

    @Override
    public void send(String msg,  IJugador sender, IJugador receiver, String sala) {
        if (receiver == null && sala.equals("")){
            iterateUsers(msg, sender);
        } else if (receiver != null && sala.equals("")) {
            receiver.receive(msg, sender);
        } else if (!sala.equals("")){
            iterateUsers(msg, sender);
            salas.get(sala).receiveBroadcast(msg, sender);
        }
    }

    private void iterateUsers(String s, IJugador sender){
        for (IJugador j: users){
            if (j != sender){
                j.receive(s, sender);
            }

        }
    }
}
