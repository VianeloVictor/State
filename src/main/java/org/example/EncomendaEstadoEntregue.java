package org.example;

public class EncomendaEstadoEntregue extends EncomendaEstado {

    private EncomendaEstadoEntregue() {};
    private static EncomendaEstadoEntregue instance = new EncomendaEstadoEntregue();
    public static EncomendaEstadoEntregue getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Entregue";
    }

    public boolean cancelado(Encomenda encomenda) {
        encomenda.setEstado(EncomendaEstadoCancelado.getInstance());
        return true;
    }

}