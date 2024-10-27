package SegundoGrau;

import java.util.Scanner;

public class app {

     static Scanner s = new Scanner(System.in);

     public static void main(String[] args) {

          double a, b, c, delta, x1, x2;
          String resposta = "s";

          while (resposta.equals("s")) {

               do {
                    System.out.println("O valor de A deve ser diferente de 0.");
                    a = le(1);

               } while (a == 0);

               b = le(2);
               c = le(3);

               EGrau2 equacao = new EGrau2(a, b, c);
               delta = equacao.delta();
               x1 = equacao.calculaX1(delta);
               x2 = equacao.calculaX2(delta);

               if (delta < 0) {
                    System.out.println("não é possível calcular raízes reais");
               } else {

                    System.out.println(exibe(x1, x2));

               }
               System.out.println("Você deseja resolver uma nova equação? (s ou n)");
               resposta = s.next();
          }

     }

     public static double le(int x) {

          if (x == 1) {
               System.out.println("Digite o valor de A: ");
          } else if (x == 2) {
               System.out.println("Digite o valor de B: ");
          } else {
               System.out.println("Digite o valor de C: ");
          }

          return s.nextDouble();
     }

     public static String exibe(double x1, double x2) {

          String s;

          s = "O valor de X1 é " + x1 + " O valor de X2 é " + x2;

          return s;
     }

}
