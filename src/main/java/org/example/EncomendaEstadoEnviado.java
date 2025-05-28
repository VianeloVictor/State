package org.example;

public class EncomendaEstadoEnviado extends EncomendaEstado {

    private EncomendaEstadoEnviado() {};
    private static EncomendaEstadoEnviado instance = new EncomendaEstadoEnviado();
    public static EncomendaEstadoEnviado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Enviado";
    }

    public boolean cancelado(Encomenda encomenda) {
        encomenda.setEstado(EncomendaEstadoCancelado.getInstance());
        return true;
    }

    public boolean caminho(Encomenda encomenda) {
        encomenda.setEstado(EncomendaEstadoCaminho.getInstance());
        return true;
    }

}
