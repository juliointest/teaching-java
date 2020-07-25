package enums;

public enum Destinos {
    MARINGA("Maringá"),
    OSASCO("Osasco"),
    GOIAS("Goiás"),
    RECIFE("Recife"),
    MANAUS("Manaus"),
    MIAMI("Miami");

    private String valor;

    Destinos(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return this.valor;
    }
}
