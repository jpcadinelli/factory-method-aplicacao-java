package br.com.jpcadinelli.factory_method_aplicacao_java;

public class CarroFactory extends TransporteFactory {
    @Override
    public Transporte criarTransporte() {
        return new Carro();
    }
}
