package org.example;

public abstract class EncomendaEstado {

    public abstract String getEstado();

    public boolean preparo(Encomenda encomenda) {
        return false;
    }

    public boolean enviado(Encomenda encomenda) {
        return false;
    }

    public boolean caminho(Encomenda encomenda) {
        return false;
    }

    public boolean entregue(Encomenda encomenda) {
        return false;
    }

    public boolean cancelado(Encomenda encomenda) {
        return false;
    }
}