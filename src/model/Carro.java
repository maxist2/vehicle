package model;

public class Carro extends Vehiculo {
    private String traccion;

    public Carro(String modelo, String marca, String placa, int velocidad_maxima, String traccion) {
        super(modelo, marca, placa, velocidad_maxima);
        this.traccion = traccion;
    }


    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }
    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", placa='" + getPlaca() + '\'' +
                ", velocidad_maxima=" + getVelocidad_maxima() +
                ", traccion='" + traccion + '\'' +
                '}';
    }
}