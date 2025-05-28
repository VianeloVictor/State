package org.example;

public class Encomenda {

    private String nome;
    private EncomendaEstado estado;

    public Encomenda() {
        this.estado = EncomendaEstadoPreparo.getInstance();
    }

    public void setEstado(EncomendaEstado estado) {
        this.estado = estado;
    }

    public boolean preparo() {
        return estado.preparo(this);
    }

    public boolean enviado() {
        return estado.enviado(this);
    }

    public boolean caminho() {
        return estado.caminho(this);
    }

    public boolean entregue() {
        return estado.entregue(this);
    }

    public boolean cancelado() {
        return estado.cancelado(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public EncomendaEstado getEstado() {
        return estado;
    }
}