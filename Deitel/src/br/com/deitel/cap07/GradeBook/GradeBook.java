package br.com.deitel.cap07.GradeBook;

// Utilizando um array para armazenar notas de teste

public class GradeBook {
    private String courseName;
    private int[] grades; // array de notas

    // construtor
    public GradeBook(String courseName, int[] grades) {
        this.courseName = courseName;
        this.grades = grades;
    }

    // recupera o nome do curso
    public String getCourseName() {
        return courseName;
    }

    // método para configurar o nome do curso
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    // realiza várias operações nos dados
    public void processGrades() {

        outputGrades();

        System.out.printf("Lowest grade is %d%n Highest grade is %d%n%n", getMinimum(), getMaximum());

        // imprime gráfico
        outputBarChart();
    }

    // localixa nota mínima
    public int getMinimum() {

        int lowGrade = grades[0];

        for (int grade : grades) {
            if (grade < lowGrade) lowGrade = grade;
        }
        return lowGrade;
    }

    // localiza maior nota
    public int getMaximum() {

        int higtGrade = grades[0];

        for (int grade : grades) {
            if (grade < higtGrade) higtGrade = grade;
        }
        return higtGrade;
    }

    // determina a média
    public double getAverage() {

        int total = 0;

        // soma notas
        for (int grade : grades) total += grade;

        return (double) total / grades.length;
    }

    // gráfico de barras
    public void outputBarChart() {

        System.out.println("Grade distribution");

        // armazena a frequencia de notas em cada intervalo de 10 notas
        int[] frequency = new int[11];

        // para cada nota, incrementa a frequencia apropriada
        for (int grade : grades) ++frequency[grade / 10];

        // para cada frequencia de nota, imprime barra no gráfico
        for (int count = 0; count < frequency.length; count++) {
            // gera saida do rótulo
            if (count == 10) System.out.printf("%5d: ", 100);
            else System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);

            // imprime barra de asteriscos
            for (int stars = 0; stars < frequency[count]; stars++) System.out.print("*");

            System.out.println();
            ;
        }
    }

    // gera a saida do conteúdo do array de notas
    public void outputGrades() {
        System.out.println("The grades are: %n%n");

        // gera a saída de cada aluno
        for (int student = 0; student < grades.length; student++)
            System.out.printf("Student %2d: %3d%n", student + 1, grades[student]);
    }
}
