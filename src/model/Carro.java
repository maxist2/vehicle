package model;

public class Carro extends Vehiculo {
    private String traccion;

    // Constructor
    public Carro(String marca, String modelo, String placa, int velocidadMaxima, String traccion) {
        super(marca, modelo, placa, velocidadMaxima);
        this.traccion = traccion;
    }

    // Getter y Setter para traccion
    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }
}
