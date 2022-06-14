package examen2.ej2;

public class Client {
    public static void main(String[] args){
        Sala sala1 = new Sala();
        Sala sala2 = new Sala();

        Jugador j1 = new Jugador("boby", "Jorge", "900", sala1);
        Jugador j2 = new Jugador("lenny6", "Leonardo", "967", sala1);
        Jugador j3 = new Jugador("ritch", "Pedro", "989", sala1);
        Jugador j4 = new Jugador("xxsassy", "Samuel", "903", sala1);

        Docente d1 = new Docente("profemaster", "Ariano", "345", sala2);
        Docente d2 = new Docente("tatayut23", "Mario", "654", sala2);
        Docente d3 = new Docente("ultramen", "Oscar", "123", sala2);
        Docente d4 = new Docente("super876t", "Eynar", "871", sala2);

        sala1.addSala(sala2, "docentes");
        sala2.addSala(sala1, "jugadores");

        sala1.addUser(j1).addUser(j2).addUser(j3).addUser(j4);
        sala2.addUser(d1).addUser(d2).addUser(d3).addUser(d4);

        j1.send("Hola bro", j2);
        j1.send("Hola equipo");
        j1.sendAll("Hola comunidad", "docentes");
    }
}
