package br.com.jpcadinelli.factory_method_aplicacao_java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarroTest {

    @Test
    void deveCalcularPrecoEntregaCorretamente() {
        Carro carro = new Carro();
        double preco = carro.calcularPrecoEntrega(10.0); // 10 kg
        assertEquals(25.0, preco);
    }

    @Test
    void deveRetornarCarroDaFactory() {
        TransporteFactory factory = new CarroFactory();
        Transporte transporte = factory.criarTransporte();
        assertTrue(transporte instanceof Carro);
    }
}
