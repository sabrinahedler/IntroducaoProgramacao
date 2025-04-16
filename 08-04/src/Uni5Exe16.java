import java.util.Scanner;

public class Uni5Exe16 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        /*
         * Dado um determinado grupo de pessoas, descreva um algoritmo que a partir da
         * altura e do gênero (gênero = 'M' ou gênero = 'm' para masculino; gênero = 'F'
         * e gênero = 'f' para feminino ou gênero = 'O' ou gênero = 'o' para outro) de
         * cada pessoa informe a média da altura das mulheres e a média de altura do
         * grupo. A leitura deve ser finalizada ao digitar 0 para a altura.
         */

        int contadorMulheres = 0;
        int contadorGrupo = 0;
        double alturaMulheres = 0;
        double alturaGrupo = 0;

        System.out.println("Informe os seguintes dados:");
        System.out.print("Altura: ");
        double altura = teclado.nextDouble();

        while (altura != 0) {
            System.out.print("Gênero (M = masculino / F = feminino / O = outro): ");
            char genero = teclado.next().charAt(0);

            if (genero == 'f' || genero == 'F') {
                alturaMulheres = alturaMulheres + altura;
                contadorMulheres++;
            } else {
                alturaGrupo = alturaGrupo + altura;
                contadorGrupo++;
            }

            System.out.print("Informe novamente um altura ou digite 0 para parar: ");
            altura = teclado.nextDouble();
        }

        System.out.println("Altura média das mulheres: " + (alturaMulheres / contadorMulheres));
        System.out.println("Altura média do grupo: " + (alturaGrupo / contadorGrupo));

        teclado.close();
    }
}