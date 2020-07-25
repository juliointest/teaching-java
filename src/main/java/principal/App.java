package principal;

import dto.Acompanhante;
import dto.Viagem;
import enums.Destinos;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Viagem primeiraViagem = new Viagem(Destinos.MARINGA);

        primeiraViagem.setDestino(Destinos.OSASCO);

        List<Acompanhante> acompanhantes = new ArrayList<Acompanhante>();

        Acompanhante primeiroAcompanhante = new Acompanhante();
        primeiroAcompanhante.setNome("Antonio Montanha");
        acompanhantes.add(primeiroAcompanhante);

        Acompanhante segundoAcompanhante = new Acompanhante();
        segundoAcompanhante.setNome("Mickey Mouse");
        acompanhantes.add(segundoAcompanhante);

        primeiraViagem.setAcompanhantes(acompanhantes);

        System.out.println(primeiraViagem.getDestino().getValor());
        System.out.println(primeiraViagem.getAcompanhantes().size());
        System.out.println(primeiraViagem.getAcompanhantes().get(0).getNome());
        System.out.println(primeiraViagem.getAcompanhantes().get(1).getNome());
    }
}
