package model;

public class Carro extends vehiculo{
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
