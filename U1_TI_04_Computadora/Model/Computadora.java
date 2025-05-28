package Model;
public class Computadora {
    private String marca;
    private String modelo;
    private boolean encendida;

    public Computadora(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.encendida = false;
    }

    public void encender() {
        if (!encendida) {
            encendida = true;
            System.out.println("Encendido");
        }
    }

    public void apagar() {
        if (encendida) {
            encendida = false;
            System.out.println("Apagado");
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public boolean isEncendida() {
        return encendida;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
