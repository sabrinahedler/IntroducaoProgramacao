import java.util.Scanner;

public class Uni5Exe07 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        // Descreva um algoritmo que leia um número inteiro n e, dados n números reais
        // informe o maior e o menor número

        System.out.println("Informe quantos número quer inserir:");
        int qnt = teclado.nextInt();
        double numero = 0;

        double maior = Double.NEGATIVE_INFINITY;
        double menor = Double.POSITIVE_INFINITY;

        for (int i = 0; i < qnt; i++) {
            numero = teclado.nextDouble();

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);

        teclado.close();
    }
}
