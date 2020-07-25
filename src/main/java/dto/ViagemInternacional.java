package dto;

import enums.Destinos;

import java.util.List;

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

    @Override
    public void setAcompanhantes(List<Acompanhante> acompanhantes) {
        if (acompanhantes.size() > 1) {
            throw new IllegalArgumentException("Não é possível ter mais que 1 acompanhante em viagens internacionais");
        }

        super.setAcompanhantes(acompanhantes);
    }
}
