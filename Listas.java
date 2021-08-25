import java.util.Scanner;

public class Listas {
    public static void main(String[] args) {
        // final int tam = 5;
        char[] gabarito = {'a', 'a', 'c', 'd', 'e'};
        char[] respostas = new char[gabarito.length];
        Scanner scan = new Scanner(System.in);

        int certas = 0;

        //respostas[0] = 'a';
        //respostas[1] = 'b';
        //respostas[2] = 'c';
        //respostas[3] = 'd';
        //respostas[4] = 'd';

        for (int i = 0; i < gabarito.length; i++) {
            System.out.print("DIGITE UMA RESPOSTA: ");
            respostas[i] = scan.nextLine().charAt(0);
        }


      for (int i = 0; i < gabarito.length; i++) {
        if (gabarito[i] == respostas[i]) {
            certas++;
        }
      }

      System.out.printf("Você acertou %d questôes", certas);
    }
}