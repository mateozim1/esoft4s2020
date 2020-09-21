package atividadeAvaliativa;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Carro carro = new Carro("Volkswagen","Gol", 1 );

        Endereco endereco = new Endereco();
        endereco.setCep("00000000");
        endereco.setLogradouro("Rua sao judas");
        endereco.setMunicipio("Maringá");
        endereco.setNumero(849);
        
        Locacao locacao = new Locacao();
        locacao.setLocadorNome("Matheus França");
        locacao.setCarros(new ArrayList<>(Arrays.asList(carro)));
        locacao.setEndereco(endereco);

    }
}
