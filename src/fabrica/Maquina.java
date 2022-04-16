package fabrica;

public class Maquina {
    private int costo;
    private String marca;

    public Maquina(int costo, String marca){
        this.costo = costo;
        this.marca = marca;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
}
