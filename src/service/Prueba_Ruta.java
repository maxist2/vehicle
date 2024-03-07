package service;

import model.vehiculo;

public class Prueba_Ruta implements Accion_vehiculo {
    @Override
    public void acelerar(vehiculo vehiculo) {
        System.out.println(vehiculo.getMarca());
    }
    @Override
    public void frenar(vehiculo vehiculo) {
        System.out.println(vehiculo.getMarca());
    }

}
