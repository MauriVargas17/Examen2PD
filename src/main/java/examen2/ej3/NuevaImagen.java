package examen2.ej3;

public class NuevaImagen implements INotification{

    private String msg = "Hay nueva imagen";

    @Override
    public String getMsg() {
        return msg;
    }
}
