package model;

public class Moto extends Vehiculo {
    private String cilindraje;

    public Moto(String modelo, String marca, String placa, int velocidad_maxima, String cilindraje) {
        super(marca, modelo, placa, velocidad_maxima);
        this.cilindraje = cilindraje;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", placa='" + getPlaca() + '\'' +
                ", velocidad_maxima=" + getVelocidad_maxima() +
                ", cilindraje='" + cilindraje + '\'' +
                '}';
    }
}