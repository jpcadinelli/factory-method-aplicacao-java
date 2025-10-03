package br.com.jpcadinelli.factory_method_aplicacao_java;

public class MotoFactory extends TransporteFactory {
    @Override
    public Transporte criarTransporte() {
        return new Moto();
    }
}
