package principal;

import dto.Viagem;

public class App {
    public static void main(String[] args) {
        Viagem primeiraViagem = new Viagem("Maringá");

        primeiraViagem.setDestino("Osasco");

        System.out.println(primeiraViagem.getDestino());
    }
}
