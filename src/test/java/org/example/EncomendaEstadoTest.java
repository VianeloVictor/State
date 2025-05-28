package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncomendaEstadoTest {

    Encomenda encomenda;

    @BeforeEach
    public void setUp() {
        encomenda = new Encomenda();
    }

    //Encomenda em preparo

    @Test
    public void deveEnviarEncomendaEmPreparo(){
        encomenda.setEstado(EncomendaEstadoPreparo.getInstance());
        assertTrue(encomenda.enviado());
        assertEquals(EncomendaEstadoEnviado.getInstance(), encomenda.getEstado());
    }

    @Test
    public void naoDeveEncaminharEncomendaEmPreparo(){
        encomenda.setEstado(EncomendaEstadoPreparo.getInstance());
        assertFalse(encomenda.caminho());
    }

    @Test
    public void naoDeveEntregarEncomendaEmPreparo(){
        encomenda.setEstado(EncomendaEstadoPreparo.getInstance());
        assertFalse(encomenda.entregue());
    }

    @Test
    public void deveCancelarEncomendaEmPreparo(){
        encomenda.setEstado(EncomendaEstadoPreparo.getInstance());
        assertTrue(encomenda.cancelado());
        assertEquals(EncomendaEstadoCancelado.getInstance(), encomenda.getEstado());
    }

    @Test
    public void naoDevePrepararEncomendaEmPreparo(){
        encomenda.setEstado(EncomendaEstadoPreparo.getInstance());
        assertFalse(encomenda.preparo());
    }


    //Encomenda a Enviada

    @Test
    public void naodeveEnviarEncomendaEnviada(){
        encomenda.setEstado(EncomendaEstadoEnviado.getInstance());
        assertFalse(encomenda.enviado());
    }

    @Test
    public void deveEncaminharEncomendaEnviada(){
        encomenda.setEstado(EncomendaEstadoEnviado.getInstance());
        assertTrue(encomenda.caminho());
        assertEquals(EncomendaEstadoCaminho.getInstance(), encomenda.getEstado());
    }

    @Test
    public void naoDeveEntregarEncomendaEnviada(){
        encomenda.setEstado(EncomendaEstadoEnviado.getInstance());
        assertFalse(encomenda.entregue());
    }

    @Test
    public void deveCancelarEncomendaEnviada(){
        encomenda.setEstado(EncomendaEstadoEnviado.getInstance());
        assertTrue(encomenda.cancelado());
        assertEquals(EncomendaEstadoCancelado.getInstance(), encomenda.getEstado());
    }

    @Test
    public void naoDevePrepararEncomendaEnviada(){
        encomenda.setEstado(EncomendaEstadoEnviado.getInstance());
        assertFalse(encomenda.preparo());
    }

    //Encomenda a Caminho

    @Test
    public void naodeveEnviarEncomendaACaminho(){
        encomenda.setEstado(EncomendaEstadoCaminho.getInstance());
        assertFalse(encomenda.enviado());
    }

    @Test
    public void naoDeveEncaminharEncomendaACaminho(){
        encomenda.setEstado(EncomendaEstadoCaminho.getInstance());
        assertFalse(encomenda.caminho());

    }

    @Test
    public void deveEntregarEncomendaACaminho() {
        encomenda.setEstado(EncomendaEstadoCaminho.getInstance());
        assertTrue(encomenda.entregue());
        assertEquals(EncomendaEstadoEntregue.getInstance(), encomenda.getEstado());
    }

    @Test
    public void deveCancelarEncomendaACaminho(){
        encomenda.setEstado(EncomendaEstadoCaminho.getInstance());
        assertTrue(encomenda.cancelado());
        assertEquals(EncomendaEstadoCancelado.getInstance(), encomenda.getEstado());
    }

    @Test
    public void naoDevePrepararEncomendaACaminho(){
        encomenda.setEstado(EncomendaEstadoCaminho.getInstance());
        assertFalse(encomenda.preparo());
    }

    //Encomenda Cancelada


    @Test void naodeveEnviarEncomendaCancelada(){
        encomenda.setEstado(EncomendaEstadoCancelado.getInstance());
        assertFalse(encomenda.enviado());
    }

    @Test
    public void naoDeveEncaminharEncomendaCancelada(){
        encomenda.setEstado(EncomendaEstadoCancelado.getInstance());
        assertFalse(encomenda.caminho());

    }

    @Test
    public void naoDeveEntregarEncomendaCancelada() {
        encomenda.setEstado(EncomendaEstadoCancelado.getInstance());
        assertFalse(encomenda.entregue());
    }

    @Test
    public void naoDeveCancelarEncomendaCancelada(){
        encomenda.setEstado(EncomendaEstadoCancelado.getInstance());
        assertFalse(encomenda.cancelado());
    }

    @Test
    public void naoDevePrepararEncomendaCancelada(){
        encomenda.setEstado(EncomendaEstadoCancelado.getInstance());
        assertFalse(encomenda.preparo());
    }

    //Encomenda Entregue

    @Test void naodeveEnviarEncomendaEntregue(){
        encomenda.setEstado(EncomendaEstadoEntregue.getInstance());
        assertFalse(encomenda.enviado());
    }

    @Test
    public void naoDeveEncaminharEncomendaEntregue(){
        encomenda.setEstado(EncomendaEstadoEntregue.getInstance());
        assertFalse(encomenda.caminho());

    }

    @Test
    public void naoDeveEntregarEncomendaEntregue() {
        encomenda.setEstado(EncomendaEstadoEntregue.getInstance());
        assertFalse(encomenda.entregue());
    }

    @Test
    public void deveCancelarEncomendaEntregue(){
        encomenda.setEstado(EncomendaEstadoEntregue.getInstance());
        assertTrue(encomenda.cancelado());
        assertEquals(EncomendaEstadoCancelado.getInstance(), encomenda.getEstado());
    }

    @Test
    public void naoDevePrepararEncomendaEntregue(){
        encomenda.setEstado(EncomendaEstadoEntregue.getInstance());
        assertFalse(encomenda.preparo());
    }



}