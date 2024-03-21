package br.com.deitel.cap07;

public class StudentPoll {

    public static void main(String[] args){
        // array com respostas, normalmente inserido em tempo de execução
        int[] responses = { 1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14};
        int[] frequency = new int[6]; // contador de frequencia

        // para cada resposta, seleicona elemento de respostas e utiliza essa valor
        // como índice de frequência para determinar elemento e aincrementar
        for (int answer = 0; answer < responses.length; answer++){
            try {
                ++frequency[responses[answer]];
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e); // invoca o método toString
                System.out.printf("   responses[%d] = %d%n%n", answer, responses[answer]);
            }
        }
        System.out.printf("%s%10s%n", "Rating", "Frequency");
        // Gera saída do valor de cada elemento do array
        for(int rating = 1; rating < frequency.length; rating++)
            System.out.printf("%6d%10d%n", rating, frequency[rating]);
    }
}