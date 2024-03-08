package model;

public class Carro extends Vehiculo{
    private String traccion;

    Carro (String traccion ){
        this.traccion = traccion;
    }

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
