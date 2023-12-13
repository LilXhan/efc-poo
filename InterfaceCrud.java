package services;

import models.Trabajador;

public interface InterfaceCrud {
    public Trabajador agregar(Trabajador trabajador);

    public Trabajador[] listar = null;

    public Trabajador buscar(String dni);

    public Trabajador editar(String dni, Trabajador trabajador);

    public void eliminar(String dni);

    public Trabajador[] ordenar = null;
}
