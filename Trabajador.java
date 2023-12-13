package models;

public class Trabajador extends Persona {
    private Float sueldo;
    private Distrito distrito;
    public Trabajador(String nombres, String primerApellido, String segundoApellido, String dni, Float sueldo) {
        super(nombres, primerApellido, segundoApellido, dni);
        this.sueldo = sueldo;
    }

    public Trabajador() {
        super();

    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "sueldo=" + sueldo +
                ", distrito=" + distrito +
                '}';
    }

    public Float getSueldo() {
        return sueldo;
    }

    public void setSueldo(Float sueldo) {
        this.sueldo = sueldo;
    }

    public Distrito getDistrito() {
        return distrito;
    }

    public void setDistrito(Distrito distrito) {
        this.distrito = distrito;
    }
}
