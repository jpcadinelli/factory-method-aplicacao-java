package br.com.jpcadinelli.factory_method_aplicacao_java;

public class Moto implements Transporte {
    private static final double TAXA_POR_KG = 2.0; // R$2,00 por kg

    @Override
    public void entregar(double peso) {
        double preco = calcularPrecoEntrega(peso);
        System.out.println("Entrega realizada por moto. Preço: R$ " + preco);
    }

    @Override
    public double calcularPrecoEntrega(double peso) {
        return peso * TAXA_POR_KG;
    }
}
