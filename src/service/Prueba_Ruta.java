package service;


import model.Vehiculo;

public class Prueba_Ruta implements Accion_vehiculo {

    @Override
    public void estacionamiento(Vehiculo vehiculo) {
        System.out.println("Se ha estacionado el vehículo " + vehiculo.getPlaca());
    }

    @Override
    public void direccion(Vehiculo vehicle) {
        System.out.println("Dirección del vehículo " + vehicle.getPlaca());
    }

    @Override
    public void acelerar(Vehiculo vehicle) {
        System.out.println("Acelerando el vehículo " + vehicle.getPlaca());
    }

    @Override
    public void frenar(Vehiculo vehicle) {
        System.out.println("Frenando el vehículo " + vehicle.getPlaca());
    }

}
