package service;


import model.Vehiculo;

public class Prueba_Ruta implements Accion_vehiculo {

    @Override
    public void estacionamiento(Vehiculo vehiculo) {
        System.out.println("Se ha estacionado el vehiculo..."+ vehiculo.getPlaca());
    }

    @Override
    public void direccion(Vehiculo vehicle) {
        System.out.println("Direccion del vehiculo..."+ vehicle.getPlaca());
    }

    @Override
    public void acelerar(Vehiculo vehicle) {
        System.out.println("Acelerar el vehiculo..."+ vehicle.getPlaca());
    }

    @Override
    public void frenar(Vehiculo vehicle) {
        System.out.println("Ha frenado el vehiculo..."+ vehicle.getPlaca());
    }

}
