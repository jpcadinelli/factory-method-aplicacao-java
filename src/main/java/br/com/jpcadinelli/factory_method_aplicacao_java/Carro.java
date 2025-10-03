package br.com.jpcadinelli.factory_method_aplicacao_java;

public class Carro implements Transporte {
    private static final double TAXA_FIXA = 10.0; // taxa base
    private static final double TAXA_POR_KG = 1.5; // R$1,50 por kg

    @Override
    public void entregar(double peso) {
        double preco = calcularPrecoEntrega(peso);
        System.out.println("Entrega realizada por carro. Preço: R$ " + preco);
    }

    @Override
    public double calcularPrecoEntrega(double peso) {
        return TAXA_FIXA + (peso * TAXA_POR_KG);
    }
}
