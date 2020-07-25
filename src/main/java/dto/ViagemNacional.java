package dto;

import enums.Destinos;

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
        if (acompanhantes.size() > 4) {
            throw new IllegalArgumentException("Não é possível ter mais que 4 acompanhantes em viagens nacionais");
        }

        super.setAcompanhantes(acompanhantes);
    }
}
