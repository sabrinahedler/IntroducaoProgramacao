import java.util.Scanner;

public class Uni6Exe01 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        /*
         * Descreva um algoritmo que leia 10 números inteiros e os coloque em um vetor
         * de 10 posições do tipo inteiro. Escreva na ordem inversa em que foram lidos.
         * Faça um método para ler e outro para escrever. OBSERVAÇÃO: Não utilize o
         * Arrays.sort
         */

        int [] vetor = new int [10];

        System.out.println("Escreva 10 números inteiros:");
         for (int i = 0; i < vetor.length; i++){
            vetor[i] = teclado.nextInt();
         }

         System.out.println();

         for (int i = vetor.length - 1; i >= 0; i--){
            System.out.println(vetor[i]);
         }

        teclado.close();
    }
}