package br.com.deitel.cap03.Exercicios.Invoice;

public class Invoice {
    private String numero;
    private String descricao;
    private int quantidadeComprada;
    private double precoItem;

    public Invoice(String numero, String descricao, int quantidadeComprada, double precoItem){
        this.numero = numero;
        this.descricao = descricao;
        if(quantidadeComprada > 0 ) this.quantidadeComprada = quantidadeComprada;
        if(precoItem > 0) this.precoItem = precoItem;
    }

    public double getInvoiceAmount(){
        return quantidadeComprada * precoItem;
    }

    public void report(){
        System.out.printf("*** Invoice ***%n");
        System.out.printf("Número: %s%n", this.getNumero());
        System.out.printf("Descrição: %s%n", this.getDescricao());
        System.out.printf("Quantidade: %d%n", this.getQuantidadeComprada());
        System.out.printf("Preço Item: %.2f%n", this.getPrecoItem());
        System.out.printf("Total Invoice: %.2f%n", this.getInvoiceAmount());
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        this.quantidadeComprada = quantidadeComprada;
    }

    public double getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(double precoItem) {
        this.precoItem = precoItem;
    }

}
