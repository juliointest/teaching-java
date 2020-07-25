package dto;

import enums.Destinos;
import utils.Propriedades;

import java.util.List;

public class ViagemNacional extends Viagem {
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
}
