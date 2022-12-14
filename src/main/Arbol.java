package main;

public class Arbol {

    private double alto;
    private double ancho;
    private String color;


    public Arbol(){
    }

    public Arbol(double alto, double ancho, String color) {
        this.alto = alto;
        this.ancho = ancho;
        this.color = color;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Arbol{" +
                "alto=" + this.alto +
                ", ancho=" + this.ancho +
                ", color='" + this.color + '\'' +
                '}';
    }
}
