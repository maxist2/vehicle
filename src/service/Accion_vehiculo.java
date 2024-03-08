package service;

import model.Vehiculo;

public interface Accion_vehiculo {

    void estacionamiento(Vehiculo vehicle);
    void direccion(Vehiculo vehicle);
    void acelerar(Vehiculo vehicle);
    void frenar(Vehiculo vehicle);
}
