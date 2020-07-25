package principal;

import dto.Acompanhante;
import dto.Viagem;
import dto.ViagemInternacional;
import dto.ViagemNacional;
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
        primeiroAcompanhante.setConfirmado(true);
        acompanhantes.add(primeiroAcompanhante);

        Acompanhante segundoAcompanhante = new Acompanhante();
        segundoAcompanhante.setNome("Mickey Mouse");
        segundoAcompanhante.setConfirmado(true);
        acompanhantes.add(segundoAcompanhante);

        primeiraViagem.setAcompanhantes(acompanhantes);

        System.out.println(primeiraViagem.getDestino().getValor());

        for (Acompanhante acompanhante : acompanhantes) {
            String jaConfirmou = "( ) ";

            if (acompanhante.isConfirmado()) {
                jaConfirmou = "(X) ";
            }

            System.out.println(jaConfirmou + acompanhante.getNome());
        }

        ViagemNacional segundaViagem = new ViagemNacional(Destinos.OSASCO);
        segundaViagem.setExigeCPF(true);
        List<Acompanhante> acompanhantesSegundaViagem = new ArrayList<Acompanhante>();
        acompanhantesSegundaViagem.add(primeiroAcompanhante);

        ViagemInternacional terceiraViagem = new ViagemInternacional(Destinos.MIAMI);
        terceiraViagem.setExigeVisto(true);
        List<Acompanhante> acompanhantesTerceiraViagem = new ArrayList<Acompanhante>();
        acompanhantesTerceiraViagem.add(segundoAcompanhante);


    }
}
