package principal;

import dto.Acompanhante;
import dto.Viagem;
import dto.CalculadoraDePrevisaoInternacional;
import dto.CalculadoraDePrevisaoNacional;
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

        for (Acompanhante acompanhante : primeiraViagem.getAcompanhantes()) {
            String jaConfirmou = "( ) ";

            if (acompanhante.isConfirmado()) {
                jaConfirmou = "(X) ";
            }

            System.out.println(jaConfirmou + acompanhante.getNome());
        }

        CalculadoraDePrevisaoNacional segundaViagem = new CalculadoraDePrevisaoNacional(Destinos.OSASCO);
        segundaViagem.setExigeCPF(true);
        List<Acompanhante> acompanhantesSegundaViagem = new ArrayList<Acompanhante>();
        acompanhantesSegundaViagem.add(primeiroAcompanhante);
        acompanhantesSegundaViagem.add(primeiroAcompanhante);
        acompanhantesSegundaViagem.add(primeiroAcompanhante);
        acompanhantesSegundaViagem.add(primeiroAcompanhante);
        segundaViagem.setAcompanhantes(acompanhantesSegundaViagem);

        System.out.println(segundaViagem.getDestino().getValor());

        for (Acompanhante acompanhante : acompanhantesSegundaViagem) {
            String jaConfirmou = "( ) ";

            if (acompanhante.isConfirmado()) {
                jaConfirmou = "(X) ";
            }

            System.out.println(jaConfirmou + acompanhante.getNome());
        }

        CalculadoraDePrevisaoInternacional terceiraViagem = new CalculadoraDePrevisaoInternacional(Destinos.MIAMI);
        terceiraViagem.setExigeVisto(true);
        List<Acompanhante> acompanhantesTerceiraViagem = new ArrayList<Acompanhante>();
        acompanhantesTerceiraViagem.add(primeiroAcompanhante);
        terceiraViagem.setAcompanhantes(acompanhantesTerceiraViagem);

        System.out.println(terceiraViagem.getDestino().getValor());

        for (Acompanhante acompanhante : acompanhantesTerceiraViagem) {
            String jaConfirmou = "( ) ";

            if (acompanhante.isConfirmado()) {
                jaConfirmou = "(X) ";
            }

            System.out.println(jaConfirmou + acompanhante.getNome());
        }

        System.out.printf("Previsão de chegada da segunda viagem é de %d dia\n", segundaViagem.calculaPrevisaoChegada());
        System.out.printf("Previsão de chegada da terceira viagem é de %d dia\n", terceiraViagem.calculaPrevisaoChegada());
    }
}
