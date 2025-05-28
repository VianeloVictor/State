package org.example;

public class EncomendaEstadoCaminho extends EncomendaEstado {

    private EncomendaEstadoCaminho() {};
    private static EncomendaEstadoCaminho instance = new EncomendaEstadoCaminho();
    public static EncomendaEstadoCaminho getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Caminho";
    }

    public boolean cancelado(Encomenda encomenda) {
        encomenda.setEstado(EncomendaEstadoCancelado.getInstance());
        return true;
    }

    public boolean entregue(Encomenda encomenda) {
        encomenda.setEstado(EncomendaEstadoEntregue.getInstance());
        return true;
    }

}
