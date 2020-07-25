package dto;

import enums.Destinos;

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
}
