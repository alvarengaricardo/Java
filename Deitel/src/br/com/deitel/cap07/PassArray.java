// Passando arrays e elementos do arrays individuais aos métodos.

package br.com.deitel.cap07;

public class PassArray {
    public static void main(String[] args) {
        // cria array e chama métodos
        int[] array = {1, 2, 3, 4, 5};
        System.out.printf("Effects of passing reference to entire array:%n" +
                "The values of the original array are:%n");

        // gera saida de elementos do array
        for (int value : array)
            System.out.printf(" %d", value);

        modifyArray(array); // passagem por referência
        System.out.printf("%n%nThe values of the modified array are:%n");

        // saida do array modificado
        for (int value : array)
            System.out.printf(" %d", value);

        System.out.printf("%n%nEffects of passing array element value:%n" +
                "array[3] before modifyElement: %d%n", array[3]);

        modifyElement(array[3]); // tenta modificar o elemento do array
        System.out.printf("array[3] after modifyElement: %d%n%n", array[3]);

        modifyInPosition(array, 3); // tenta modificar o elemento do array, informando sua posição
        System.out.printf("array[3] after modifyInPosition: %d%n%n", array[3]);

        // saida do array modificado
        for (int value : array)
            System.out.printf(" %d", value);
    }

    // dobra o valor de cada elemento do array
    public static void modifyArray(int[] array2) {
        for (int counter = 0; counter < array2.length; counter++)
            array2[counter] *= 2;
    }

    public static void modifyElement(int element) {
        element *= 2;
        System.out.printf("Value of element in modifyElement: %d%n", element);
    }

    public static void modifyInPosition(int[] array2, int position) {
        array2[position] *= 2;
        System.out.printf("Value of element in modifyInPosition: %d%n", array2[position]);
    }
}