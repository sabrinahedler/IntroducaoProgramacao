import java.util.Scanner;

public class teste {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        // Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do
        // jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo
        // uma duração mínima de 1 hora e máxima de 24 horas.

        int horaInicial = teclado.nextInt();
        int horaFinal = teclado.nextInt();

        int duracao = 0;

        if (horaFinal > horaInicial) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = (24 - horaInicial) + horaFinal;
        }
        
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        teclado.close();
    }
}