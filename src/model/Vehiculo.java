package model;

public class Vehiculo {
    private String modelo;
    private String marca;
    private String placa;
    private int velocidad_maxima;

    public Vehiculo(String modelo, String marca, String placa, int velocidad_maxima) {
        this.modelo = modelo;
        this.marca = marca;
        this.placa = placa;
        this.velocidad_maxima = velocidad_maxima;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getVelocidad_maxima() {
        return velocidad_maxima;
    }

    public void setVelocidad_maxima(int velocidad_maxima) {
        this.velocidad_maxima = velocidad_maxima;
    }
}