import java.util.Scanner;

public class Uni6Exe06 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        /*
         * Faça um programa que leia um valor N inteiro. Com base neste valor, crie um
         * vetor do tipo real. Em seguida, solicite ao usuário informar essa quantidade
         * N de valores reais para popular o vetor. Após ter preenchido o vetor,
         * solicite que o usuário informe um outro valor real. Informe para o usuário se
         * este valor informado se encontra cadastrado no vetor. Faça um método para ler
         * o vetor e outro, que retorne verdadeiro ou falso, para encontrar o valor.
         */

        System.out.println("Informe um valor inteiro para o limite do vetor:");
        int valor = teclado.nextInt();

        double[] vetor = new double[valor];

        System.out.println("Agora, preencha o vetor com valores:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = teclado.nextDouble();
        }

        System.out.println("Por fim, informe um valor real:");
        double valorReal = teclado.nextDouble();

        for (int i = 0; i < vetor.length; i++) {
            if (valorReal == vetor[i]) {
                System.out.println("O número " + valorReal + " está dentro do vetor!");
            } else {

            }
        }

        teclado.close();
    }
}