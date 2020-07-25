package dto;

import enums.Destinos;
import utils.Propriedades;

import java.util.List;

public class ViagemNacional extends Viagem implements interfaces.Viagem {
    public ViagemNacional(Destinos destinos) {
        super(destinos);
    }

    private boolean exigeCPF;

    public boolean isExigeCPF() {
        return exigeCPF;
    }

    public void setExigeCPF(boolean exigeCPF) {
        this.exigeCPF = exigeCPF;
    }

    @Override
    public void setAcompanhantes(List<Acompanhante> acompanhantes) {
        if (acompanhantes.size() > Integer.parseInt(Propriedades.getPropriedade("viagem.nacional.limite.acompanhantes"))) {
            throw new IllegalArgumentException("Não é possível ter mais que "
                    + Propriedades.getPropriedade("viagem.nacional.limite.acompanhantes")
                    + " acompanhantes em viagens nacionais");
        }

        super.setAcompanhantes(acompanhantes);
    }

    @Override
    public int calculaPrevisaoChegada() {
        int previsaoChegada = 0;

        switch (this.getDestino()) {
            case OSASCO: previsaoChegada = 1; break;
            case MARINGA: previsaoChegada = 2; break;
            case GOIAS: previsaoChegada = 3; break;
            case MANAUS: previsaoChegada = 4; break;
            case RECIFE: previsaoChegada = 4; break;
        }

        return previsaoChegada;
    }
}
