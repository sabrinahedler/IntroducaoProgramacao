import java.util.Scanner;

public class Uni6Exe02 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        /*
         * Descreva um algoritmo que leia 12 valores reais e os coloque em um vetor de
         * 12 posições do tipo real. Imprima quais valores desses informados são maiores
         * que a média dos valores. Faça um método para ler os valores, outro para
         * calcular a média e outro para informar os valores maiores que a média.
         */

        double media = 0;
        double[] vetor = new double[12];

        System.out.println("Escreva 12 números reais:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = teclado.nextDouble();

            media = media + vetor[i];
        }

        media = media / vetor.length;

        System.out.println("A média dos números digitados é: " + media);
        System.out.println("Os números acima da média são:");
        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i] > media) {
                System.out.println(vetor[i]);
            } else {

            }
        }

        teclado.close();
    }
}