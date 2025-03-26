import java.util.Scanner;

public class testeSelecao {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        // Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D for maior do que A, 
        // e a soma de C com D for maior que a soma de A e B e se C e D, ambos, forem positivos e se a variável A
        // for par escrever a mensagem "Valores aceitos", senão escrever "Valores nao aceitos".

        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();
        int d = teclado.nextInt();

        if (b > c && d > a ){
            int somaCD = c + d;
            int somaAB = a + b;

            if (somaCD > somaAB){
                if (c > 0 && d > 0 && a % 2 == 0){
                    System.out.println("Valores aceitos");
                } else {
                    System.out.println("Valores nao aceitos");
                }
            } else {
                System.out.println("Valores nao aceitos");
            }
        } else {
            System.out.println("Valores nao aceitos");
        }

        teclado.close();
    }
}