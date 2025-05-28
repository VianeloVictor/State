package org.example;

public class EncomendaEstadoPreparo extends EncomendaEstado {

    private EncomendaEstadoPreparo() {};
    private static EncomendaEstadoPreparo instance = new EncomendaEstadoPreparo();
    public static EncomendaEstadoPreparo getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Preparando";
    }

    public boolean cancelado(Encomenda encomenda) {
        encomenda.setEstado(EncomendaEstadoCancelado.getInstance());
        return true;
    }

    public boolean enviado(Encomenda encomenda) {
        encomenda.setEstado(EncomendaEstadoEnviado.getInstance());
        return true;
    }

}
