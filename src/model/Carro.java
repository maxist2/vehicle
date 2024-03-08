package model;

public class Carro extends Vehiculo{
    private String traccion;

    public Carro(){
        super();
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }
}
