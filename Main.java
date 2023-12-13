import controller.TrabajadorControlador;
import models.Distrito;
import models.Trabajador;

public class Main {
    public static void main(String[] args) {
        Trabajador trabajador1 = new Trabajador("Pepe", "Popis", "Medrano", "4343443", 12312f);
        Trabajador trabajador2 = new Trabajador("Flavio", "Alvarado", "Tucto", "77336861", 12312f);
        Trabajador trabajador3 = new Trabajador("Manuel", "Velazco", "Suarez", "54323861", 12312f);
        Trabajador trabajador4 = new Trabajador("Pedro", "Vasques", "Quiroz", "77454565", 12312f);
        Trabajador trabajador5 = new Trabajador("Juan", "Mariategui", "Duende", "43432132", 12312f);

        Distrito distrito1 = new Distrito("La molina");
        trabajador1.setDistrito(distrito1);
        trabajador2.setDistrito(distrito1);
        trabajador3.setDistrito(distrito1);
        trabajador4.setDistrito(distrito1);
        trabajador5.setDistrito(distrito1);


        TrabajadorControlador controlador = new TrabajadorControlador();
        controlador.agregar(trabajador1);
        controlador.agregar(trabajador2);
        controlador.agregar(trabajador3);
        controlador.agregar(trabajador4);
        controlador.agregar(trabajador5);

        // LISTAR TRABAJADORES
        controlador.listar();
        // BUSCAR TRABAJADORES
        System.out.println(controlador.buscar("77336861"));
        // EDITAR TRABAJADOR
        Trabajador trabajador5Edit = new Trabajador("Juan", "Perez", "Duende", "43432132", 12312f);
        controlador.editar("43432132", trabajador5Edit);
        // ELIMINAR TRABAJADOR
        controlador.eliminar("43432132");
        System.out.println("2da vez");
        // MOSTRAR DENUEVO LOS TRABAJADORES PARA VER SI SE ELIMINO EL REGISTRO EN ESTE CASO SALE NULL EL REGISTRO QUE SE ELIMINO
        controlador.listar();
    }

}