package controller;


import models.Trabajador;
import services.InterfaceCrud;

public class TrabajadorControlador implements InterfaceCrud {

    public Trabajador[] trabajadores = {};
    public Long indice;
    public Long dni;

    public TrabajadorControlador() {

    }

    public TrabajadorControlador(Trabajador[] trabajadores, Long indice, Long dni) {
        this.trabajadores = trabajadores;
        this.indice = indice;
        this.dni = dni;
    }

    public Trabajador[] getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(Trabajador[] trabajadores) {
        this.trabajadores = trabajadores;
    }

    public Long getIndice() {
        return indice;
    }

    public void setIndice(Long indice) {
        this.indice = indice;
    }

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public Trabajador[] listar() {
            if (trabajadores.length == 0) {
                System.out.println("No hay trabajadores registrados.");
            } else {
                System.out.println("Lista de Trabajadores:");
                for (Trabajador trabajador : trabajadores) {
                    System.out.println("DNI: " + trabajador.getDni());
                    System.out.println("Nombres: " + trabajador.getNombres());
                    System.out.println("Apellidos: " + trabajador.getPrimerApellido() + " " + trabajador.getSegundoApellido());
                    System.out.println("Distrito: " + trabajador.getDistrito());
                    System.out.println("Sueldo: " + trabajador.getSueldo());
                    System.out.println("---------------------------");
                }
            }
            return trabajadores;
        }

    @Override
    public Trabajador agregar(Trabajador trabajador) {
        Trabajador[] nuevoArreglo = new Trabajador[trabajadores.length + 1];
        System.arraycopy(trabajadores, 0, nuevoArreglo, 0, trabajadores.length);
        nuevoArreglo[trabajadores.length] = trabajador;
        trabajadores = nuevoArreglo;
        return trabajador;
    }

    @Override
    public Trabajador buscar(String dni) {
        for (int i = 0; i < trabajadores.length; i++) {
            if(trabajadores[i].getDni() == dni) {
                return trabajadores[i];
            }
        }
        return null;
    }

    @Override
    public Trabajador editar(String dni, Trabajador trabajador) {
        for (int i = 0; i < trabajadores.length; i++) {
            if(trabajadores[i].getDni() == dni) {
                trabajadores[i].setDistrito(trabajador.getDistrito());
                trabajadores[i].setSueldo(trabajador.getSueldo());
                trabajadores[i].setDni(trabajador.getDni());
                trabajadores[i].setNombres(trabajador.getNombres());
                trabajadores[i].setPrimerApellido(trabajador.getPrimerApellido());
                trabajadores[i].setSegundoApellido(trabajador.getSegundoApellido());
                return trabajadores[i];
            }
        }
        return null;
    }

    @Override
    public void eliminar(String dni) {
        for (int i = 0; i < trabajadores.length; i++) {
            if(trabajadores[i].getDni() == dni) {
                Trabajador trabajador = new Trabajador();
                trabajadores[i] = trabajador;
            }
        }
    }
}
