package br.com.meli;

public class Pereciveis extends Produto{

    private int diasParavencer;

    public Pereciveis(String nome, double preco, int diasParavencer) {
        super(nome, preco);
        this.diasParavencer = diasParavencer;
    }

    @Override
    public double calcular(int quantidadeProdutos) {
        double precoBase = super.calcular(quantidadeProdutos);

        if (diasParavencer == 1) {
            precoBase /=  4;
        }

        if (diasParavencer == 2) {
            precoBase /= 3;
        }

        if (diasParavencer == 3) {
            precoBase /= 2;
        }

        return precoBase;
    }

    public int getDiasParavencer() {
        return diasParavencer;
    }

    public void setDiasParavencer(int diasParavencer) {
        this.diasParavencer = diasParavencer;
    }

    @Override
    public String toString() {
        return super.toString() + " Pereciveis{" +
                "diasParavencer=" + diasParavencer +
                '}';
    }
}
