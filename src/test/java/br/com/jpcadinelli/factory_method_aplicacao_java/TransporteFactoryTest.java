package br.com.jpcadinelli.factory_method_aplicacao_java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransporteFactoryTest {
    @Test
    void devePlanejarEntregaComMoto() {
        TransporteFactory factory = new MotoFactory();
        Transporte transporte = factory.criarTransporte();
        double preco = transporte.calcularPrecoEntrega(3.0);
        assertEquals(6.0, preco);
    }

    @Test
    void devePlanejarEntregaComCarro() {
        TransporteFactory factory = new CarroFactory();
        Transporte transporte = factory.criarTransporte();
        double preco = transporte.calcularPrecoEntrega(4.0);
        assertEquals(16.0, preco);
    }
}
