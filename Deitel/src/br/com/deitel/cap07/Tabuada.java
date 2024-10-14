package br.com.deitel.cap07;

public class Tabuada {
    public static void main(String[] args) {

        final int ARRAY_LENGTH = 10;
        //criando vetores
        int[] array1 = new int[10];
        int[] array2 = new int[ARRAY_LENGTH];
        int[] array3 = new int[ARRAY_LENGTH];
        int[] array4 = new int[ARRAY_LENGTH];
        int[] array5 = new int[ARRAY_LENGTH];

        // alimentando vetores
        for (int counter = 1; counter <= array3.length; counter++) {
            array1[counter - 1] = counter;
            array2[counter - 1] = 2 * counter;
            array3[counter - 1] = 3 * counter;
            array4[counter - 1] = 4 * counter;
            array5[counter - 1] = 5 * counter;
        }

        System.out.printf("%s%5s%5s%5s%5s%n", "Index", "2", "3", "4", "5");
        System.out.printf("-------------------------%n");

        for (int counter = 0; counter < array1.length; counter++) {
            System.out.printf("%5d%5d%5d%5d%5d%n",
                    array1[counter], array2[counter], array3[counter], array4[counter], array5[counter]);
        }
    }
}
