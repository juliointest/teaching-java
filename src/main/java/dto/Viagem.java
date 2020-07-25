package dto;

import enums.Destinos;

import java.util.List;

public class Viagem {
    private Destinos destino;
    private List<Acompanhante> acompanhantes;

    public List<Acompanhante> getAcompanhantes() {
        return acompanhantes;
    }

    public void setAcompanhantes(List<Acompanhante> acompanhantes) {
        this.acompanhantes = acompanhantes;
    }

    public Viagem(Destinos destino) {
        this.destino = destino;
    }

    public void setDestino(Destinos destino) {
        this.destino = destino;
    }

    public Destinos getDestino() {
        return this.destino;
    }
}
