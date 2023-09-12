package br.com.deitel.cap07;

/*
    Algumas formas de iniciar um array
 */
public class InitArray {
    public static void main(String[] args) {

        final int ARRAY_LENGTH = 10;
        int[] array = new int[10];
        int[] array2 = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};
        int[] array3 = new int[ARRAY_LENGTH];

        for (int counter = 0; counter < array3.length; counter++) {
            array3[counter] = 2 + 2 * counter;
        }

        System.out.printf("%s%9s%9s%9s%n", "Index", "Array", "Array2", "Array3");

        for (int counter = 0; counter < array.length; counter++) {
            System.out.printf("%5d%9d%9d%9d%n",
                    counter, array[counter], array2[counter], array3[counter]);
        }
    }
}
