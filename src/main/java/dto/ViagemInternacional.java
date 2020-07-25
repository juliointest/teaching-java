package dto;

import enums.Destinos;

public class ViagemInternacional extends Viagem {
    public ViagemInternacional(Destinos destino) {
        super(destino);
    }

    private boolean exigeVisto;

    public boolean isExigeVisto() {
        return exigeVisto;
    }

    public void setExigeVisto(boolean exigeVisto) {
        this.exigeVisto = exigeVisto;
    }
}
