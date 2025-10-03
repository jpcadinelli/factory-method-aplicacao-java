package br.com.jpcadinelli.factory_method_aplicacao_java;

public abstract class TransporteFactory {
    public abstract Transporte criarTransporte();

    public void planejarEntrega(double peso) {
        Transporte transporte = criarTransporte();
        transporte.entregar(peso);
    }
}
