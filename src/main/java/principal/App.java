package principal;

import dto.Viagem;
import enums.Destinos;

public class App {
    public static void main(String[] args) {
        Viagem primeiraViagem = new Viagem(Destinos.MARINGA);

        primeiraViagem.setDestino(Destinos.OSASCO);

        System.out.println(primeiraViagem.getDestino().getValor());
    }
}
