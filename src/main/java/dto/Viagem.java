package dto;

import enums.Destinos;

public class Viagem {
    private Destinos destino;

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
