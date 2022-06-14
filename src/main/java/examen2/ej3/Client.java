package examen2.ej3;

public class Client {
    public static void main(String[] args){
        Web web = new Web();
        User u1 = new User("Horacio", true);
        User u2 = new User("Humberto", true);
        User u3 = new User("Pablo", false);
        User u4 = new User("Vicente", false);
        User u5 = new User("Ernesto", true);

        web.add(u1);
        web.add(u2);
        web.add(u3);
        web.add(u4);
        web.add(u5);

        web.notifyUser(new NuevoVideo());
        System.out.println();
        web.notifyUser(new NuevaImagen());

    }
}
