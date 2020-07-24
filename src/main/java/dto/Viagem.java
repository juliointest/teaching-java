package dto;

import java.util.Date;
import java.util.List;

public class Viagem {
    private String destino;
    private List<Acompanhante> acompanhantes;
    private Date dataPartida;
    private Date dataRetorna;

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDestino() {
        return this.destino;
    }

    public void setAcompanhantes(List<Acompanhante> acompanhantes) {
        this.acompanhantes = acompanhantes;
    }

    public List<Acompanhante> getAcompanhantes() {
        return acompanhantes;
    }

    public Date getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(Date dataPartida) {
        this.dataPartida = dataPartida;
    }

    public Date getDataRetorna() {
        return dataRetorna;
    }

    public void setDataRetorna(Date dataRetorna) {
        this.dataRetorna = dataRetorna;
    }
}
