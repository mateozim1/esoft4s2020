package atividadeAvaliativa;

public class Carro {

    public Carro(String marca, String modelo, int codigo){
        this.marca = marca;
        this.modelo = modelo;
        this.codigo = codigo;
    }

    private String marca;
    private String modelo;
    private int codigo;

    public String getModelo() {
        return modelo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if (codigo < 0)
            throw new RuntimeException("É necessario informar um valor positivo para o código do carro.");

        this.codigo = codigo;
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

    @Override
    public  String toString() {
        return "Carro [marca=" + this.marca + ","
            + "modelo=" + this.modelo + "," 
            + "codigo=" + this.codigo + ","  
            + "]";
    }
}