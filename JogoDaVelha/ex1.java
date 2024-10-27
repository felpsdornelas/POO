import java.util.Scanner;

public class ex1 {

     public static Scanner s = new Scanner(System.in);

     public static int lerNumeros() {

          System.out.print("Digite um número: ");
          return s.nextInt();
     }

     public static void restringirNumeros() {
          System.out.println("O número não possui paridade, pois ele é negativo");
     }

     public static int verificarParidade(int num1) {

          if (num1 % 2 == 0) {
               return 0;
          } else {
               return 1;
          }
     }

     public static void exibirParidade(int paridade) {

          switch (paridade) {
               case 0:
                    System.out.println("O número é par");
                    break;
               case 1:
                    System.out.println("O número é ímpar");
                    break;
          }
     }

     public static void main(String[] args) {
          int num1;

          num1 = lerNumeros();

          while (num1 < 0) {
               restringirNumeros();
               num1 = lerNumeros();
          }

          int paridade = verificarParidade(num1);
          exibirParidade(paridade);

     }
}
