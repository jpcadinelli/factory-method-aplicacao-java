package br.com.jpcadinelli.factory_method_aplicacao_java;

public interface Transporte {
    void entregar(double peso);
    double calcularPrecoEntrega(double peso);
}
