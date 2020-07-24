package principal;

import dto.Viagem;

public class App {
    public static void main(String[] args) {
        Viagem primeiraViagem = new Viagem("Maringá");

        System.out.println(primeiraViagem.destino);
    }
}
