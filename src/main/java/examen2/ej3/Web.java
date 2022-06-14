package examen2.ej3;

import java.util.ArrayList;
import java.util.List;

public class Web implements IPagina{
    private List<User> users = new ArrayList<>();


    @Override
    public void add(User user) {
        users.add(user);
    }

    @Override
    public void remove(User user) {
        users.remove(user);
    }

    @Override
    public void notifyUser(INotification notification) {
        System.out.println("*** Notificando de "+notification.getMsg().toUpperCase()+" ***");
        for(User u: users){
            if(notification instanceof NuevoVideo && u.isOnlyVideos()){
                u.getUpdated(notification);
            } else if (!u.isOnlyVideos()){
                u.getUpdated(notification);
            }
        }
    }
}
