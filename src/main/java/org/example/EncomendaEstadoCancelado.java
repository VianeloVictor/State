package org.example;

public class EncomendaEstadoCancelado extends EncomendaEstado {

    private EncomendaEstadoCancelado() {};
    private static EncomendaEstadoCancelado instance = new EncomendaEstadoCancelado();
    public static EncomendaEstadoCancelado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Cancelado";
    }
}