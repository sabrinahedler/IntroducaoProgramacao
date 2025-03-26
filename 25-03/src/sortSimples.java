import java.util.Scanner;

public class sortSimples {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        // Leia 3 valores inteiros e ordene-os em ordem crescente. No final, mostre os
        // valores em ordem crescente, uma linha em branco e em seguida, os valores na
        // sequência como foram lidos.

        int valor1 = teclado.nextInt();
        int valor2 = teclado.nextInt();
        int valor3 = teclado.nextInt();

        int valorMaior = 0;
        int valorMediano = 0;
        int valorMenor = 0;

        if (valor1 > valor2 && valor2 > valor3) {
            valorMaior = valor1;
            valorMediano = valor2;
            valorMenor = valor3;
        } else if (valor1 > valor3 && valor3 > valor2) {
            valorMaior = valor1;
            valorMediano = valor3;
            valorMenor = valor2;
        } else if (valor2 > valor1 && valor1 > valor3) {
            valorMaior = valor2;
            valorMediano = valor1;
            valorMenor = valor3;
        } else if (valor2 > valor3 && valor3 > valor1) {
            valorMaior = valor2;
            valorMediano = valor3;
            valorMenor = valor1;
        } else if (valor3 > valor2 && valor2 > valor1) {
            valorMaior = valor3;
            valorMediano = valor2;
            valorMenor = valor1;
        } else {
            valorMaior = valor3;
            valorMediano = valor1;
            valorMenor = valor2;
        }

        System.out.println(valorMenor);
        System.out.println(valorMediano);
        System.out.println(valorMaior);
        System.out.println();
        System.out.println(valor1);
        System.out.println(valor2);
        System.out.println(valor3);

        teclado.close();
    }
}
