package br.com.jpcadinelli.factory_method_aplicacao_java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MotoTest {

    @Test
    void deveCalcularPrecoEntregaCorretamente() {
        Moto moto = new Moto();
        double preco = moto.calcularPrecoEntrega(5.0); // 5 kg
        assertEquals(10.0, preco);
    }

    @Test
    void deveRetornarMotoDaFactory() {
        TransporteFactory factory = new MotoFactory();
        Transporte transporte = factory.criarTransporte();
        assertTrue(transporte instanceof Moto);
    }
}
