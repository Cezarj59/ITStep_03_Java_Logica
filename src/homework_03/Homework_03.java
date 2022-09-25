package homework_03;

import java.util.Scanner;

public class Homework_03 {

    public static void main(String[] args) {

        /*------------------------------------------------------------------------*/
        System.out.println("Numeros multiplos de 3 e 6, ao mesmo tempo, entre 0 e 100");
        for (int i = 1; i <= 100; i++) {
            int valor1 = 6 * i;

            if (valor1 <= 100) {
                System.out.print(valor1 + " ");

            }

        }


        /*------------------------------------------------------------------------*/
        System.out.println("\n");
        System.out.println(
                "Numeros divisiveis por 4 e 5, ao mesmo tempo, entre 200 e 300");

        for (int i = 200;
                i <= 300; i++) {
            if (i % 5 == 0 && i % 4 == 0) {
                System.out.print(i + " ");
            }

        }

        /*------------------------------------------------------------------------*/
        System.out.println(
                "\n");
        System.out.println(
                "Numeros Primos entre 0 e 100.");

        for (int i = 0;
                i <= 100; i++) { //Entrada 0 a 100
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

        /*------------------------------------------------------------------------*/
        System.out.println(
                "\n");
        System.out.println(
                "Receba um número do usuário e informe os seus 100 primeiros múltiplos;");

        Scanner leia = new Scanner(System.in);

        System.out.println(
                "Digite um número:");

        int num = leia.nextInt();
        for (int i = 1;
                i <= 100; i++) {
            int valor = num * i;

            System.out.print(valor + " ");
        }

    }

}
