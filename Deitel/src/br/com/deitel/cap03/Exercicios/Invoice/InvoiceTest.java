package br.com.deitel.cap03.Exercicios.Invoice;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("001", "TV", 1, 1500);
        invoice1.report();

        Invoice invoice2 = new Invoice("002", "Celular", 3, 2200);
        invoice2.report();
    }
}
