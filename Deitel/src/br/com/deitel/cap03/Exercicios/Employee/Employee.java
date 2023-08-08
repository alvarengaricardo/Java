package br.com.deitel.cap03.Exercicios.Employee;

public class Employee {
    public String nome;
    public String sobrenome;
    public double salarioMensal;

    public Employee(String nome, String sobrenome, double salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        if (salarioMensal > 0) this.salarioMensal = salarioMensal;
    }

    double getSalarioAnual(){
        return this.salarioMensal * 12;
    }

    void report(){
        System.out.printf("*** Employee ***%n");
        System.out.printf("Nome: %s%n", this.getNome());
        System.out.printf("Sobrenome: %s%n", this.getSobrenome());
        System.out.printf("Salário Mensal: %.2f%n", this.getSalarioMensal());
        System.out.printf("Salário Mensal: %.2f%n%n", this.getSalarioAnual());
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
}
