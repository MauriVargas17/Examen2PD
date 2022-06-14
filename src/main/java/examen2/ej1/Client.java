package examen2.ej1;

public class Client {
    public static void main(String[] args){
       Versionador versionador = new Versionador();
       Repositorio repositorio = new Repositorio();

       Texto texto = new Texto("este documento es una prueba");
       versionador.setVersion(texto);
       repositorio.createSave(versionador.createVersion());
       texto = new Texto(texto.getTexto()+" el exito solo depende de tu esfuerzo");
       versionador.setVersion(texto);
       repositorio.createSave(versionador.createVersion());
        texto = new Texto(texto.getTexto()+" prologo");
        versionador.setVersion(texto);
        repositorio.createSave(versionador.createVersion());
        texto = new Texto(texto.getTexto()+" este documento fue actualizado satisfactoriamente");
        versionador.setVersion(texto);
        repositorio.createSave(versionador.createVersion());
        System.out.println(texto.getTexto());


        texto = versionador.restoreVersion(repositorio.getSave("version3"));
        System.out.println(texto.getTexto());
    }

}
