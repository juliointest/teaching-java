package dto;

import enums.Destinos;
import utils.Propriedades;

import java.util.List;

public class ViagemInternacional extends Viagem implements interfaces.Viagem  {
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

    public void setAcompanhantes(List<Acompanhante> acompanhantes) {
        if (acompanhantes.size() > Integer.parseInt(Propriedades.getPropriedade("viagem.internacional.limite.acompanhantes"))) {
            throw new IllegalArgumentException("Não é possível ter mais que "
                    + Propriedades.getPropriedade("viagem.internacional.limite.acompanhantes")
                    + " acompanhante em viagens internacionais");
        }

        super.setAcompanhantes(acompanhantes);
    }

    @Override
    public int calculaPrevisaoChegada() {
        int previsaoChegada = 0;

        switch (this.getDestino()) {
            case MIAMI: previsaoChegada = 1;
        }

        return previsaoChegada;
    }
}
