package examen2.ej2;

import java.util.ArrayList;
import java.util.List;

public class Sala implements IChat{
    List<IJugador> users = new ArrayList<>();

    public Sala addUser(IJugador jugador){
        users.add(jugador);
        return this;
    }

    @Override
    public void send(String msg,  IJugador sender, IJugador receiver) {
        if (receiver == null){
            iterateUsers(msg, sender);
        } else {
            receiver.receive(msg, sender);
        }
    }

    private void iterateUsers(String s, IJugador sender){
        for (IJugador j: users){
            j.receive(s, sender);
        }
    }
}
