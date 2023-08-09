package br.com.deitel.cap03.Exercicios.Date;

public class Date {

    private int dia;

    private int mes;

    private int ano;

    public Date(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void displayDate() {
        System.out.printf("%d/%d/%d", getDia(), getMes(), getAno());
    }

    public void setDia(int d) {
        dia = d;
    }

    public int getDia() {
        return dia;
    }

    public void setMes(int m) {
        mes = m;
    }

    public int getMes() {
        return mes;
    }

    public void setAno(int a) {
        ano = a;
    }

    public int getAno() {
        return ano;
    }
}