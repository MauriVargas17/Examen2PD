package examen2.ej1;

public class Versionador {
    private Texto state;

    public Texto getState() {
        return state;
    }

    public void setVersion(Texto state) {
        this.state = state;
    }

    public Memento createVersion(){
        return new Memento(state);
    }

    public Texto restoreVersion(Memento m){
        System.out.println("***** Recuperando ****");
        this.state = m.getTexto();
        return this.state;
    }
}
