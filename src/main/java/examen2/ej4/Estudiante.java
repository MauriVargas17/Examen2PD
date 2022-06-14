package examen2.ej4;

public class Estudiante {
    private int ci;
    private String nombre;
    private String fechaNacimiento;
    private String carrera;

    public Estudiante(int ci, String nombre, String fechaNacimiento, String carrera) {
        this.ci = ci;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.carrera = carrera;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
