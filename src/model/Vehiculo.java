package model;

public class Vehiculo {
    private String marca;
    private String modelo;
    private String placa;
    private int velocidadMaxima;
    public Vehiculo(String marca, String modelo, String placa, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.velocidadMaxima = velocidadMaxima;
    }

    // Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
}
