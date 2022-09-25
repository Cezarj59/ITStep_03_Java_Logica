package classroom_03;

public class Classroom_03 {

  
    public static void main(String[] args) {
        int[][] numeros = {
            {1, 4, 8, 9},
            {3, 2, 1, 7},
            {6, 5, 3, 8},
            {2, 9, 4, 5}
        };

        System.out.println("Imprimindo numeros pares de dentro do array números.\n");

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[i][j] % 2 == 0) {
                    System.out.print(numeros[i][j] + " ");
                }
            }
        }

        System.out.println("\n");
        System.out.println("Imprimindo numeros impares de dentro do array números.\n");
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[i][j] % 2 != 0) {
                    System.out.print(numeros[i][j] + " ");
                }
            }
        }

        System.out.println("\n");
        System.out.println("Imprimindo numeros impares de 0 a 100.\n");
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        };

        System.out.println("\n");
        System.out.println("Multiplos de 7 entre 0 e 200.\n");

        for (int i = 0; i <= 200; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n");
        System.out.println("Numeros Primos entre 0 e 100.\n");

        for (int i = 0; i <= 100; i++) { //Entrada 0 a 100
            int divisores = 0; // conta divisores

            for (int j = 1; j <= 100; j++) { // faz a divisão e faz a contagem de divisores
                if (i % j == 0) {
                    divisores++;
                }
                if (j == i) { // paraliza o loop quando j for igual a i
                    break;
                }
            }

            if (divisores == 2) { // se a quantidede de divisores for igual a 2, dividido po 1 e ele mesmo imprime i.
                System.out.print(i + " ");
            }

        }

    }
}
