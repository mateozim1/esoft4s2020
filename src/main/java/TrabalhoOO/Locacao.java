package atividadeAvaliativa;

import java.util.List;

public class Locacao {

    private String locadorNome;
    private Endereco endereco;
    private List<Carro> carros;

    public Endereco getEndereco() {
        return endereco;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }

    public String getLocacaoNome() {
        return locadorNome;
    }

    public void setLocadorNome(String locadorNome) {
        this.locadorNome = locadorNome;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}