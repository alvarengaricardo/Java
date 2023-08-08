package br.com.deitel.cap03.Exercicios.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ricardo", "Alvarenga", 1000);
        Employee employee2 = new Employee("Lexxi", "Dog", 2000);

        employee1.report();
        employee2.report();

        employee1.setSalarioMensal(employee1.getSalarioMensal() * 1.1);
        employee2.setSalarioMensal(employee2.getSalarioMensal() * 1.1);

        employee1.report();
        employee2.report();


    }
}
