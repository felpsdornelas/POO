import java.util.Scanner;

public class JogoVelha {

     public static Scanner s = new Scanner(System.in);
     public static int tabuleiro[][] = new int[3][3];

     public static void main(String[] args) {

          // Declaração de váriavéis úteis para o projeto;
          int jogador = 1;
          boolean continuacaoJogo = true;

          // inicializa o tabuleiro com zeros;
          for (int i = 0; i < tabuleiro.length; i++) {
               for (int j = 0; j < tabuleiro.length; j++) {
                    tabuleiro[i][j] = 0;
               }
          }

          while (continuacaoJogo) {
               // Exibe o tabuleiro atual e solicita a posição da jogada;
               int posicao = interfaceTabuleiro(jogador);

               // Verifica se a jogada é válida;
               if (validacao(posicao)) {
                    // Atualiza o tabuleiro com a jogada do jogador;
                    atualizarTabuleiro(posicao, jogador);

                    // Verifica se houve vitória
                    if (vitoria()) {
                         exibeFim(jogador); // Exibe o jogador vencedor
                         continuacaoJogo = false;
                    }
                    // Verifica se houve empate
                    else if (empate()) {
                         exibeFim(0); // Exibe empate
                         continuacaoJogo = false;
                    } else {
                         // Alterna o jogador
                         jogador = (jogador == 1) ? 2 : 1;
                    }
               } else {
                    restricao(); // Jogada inválida
               }
          }
     }

     // A função exibe e lê a jogada do usuário;
     public static int interfaceTabuleiro(int jogador) {

          System.out.println("Tabuleiro Atual: ");
          System.out.println();

          for (int i = 0; i < tabuleiro.length; i++) {
               for (int j = 0; j < tabuleiro.length; j++) {
                    System.out.print(tabuleiro[i][j] + " ");
               }
               System.out.println();
          }

          System.out.println("\n1 2 3");
          System.out.println("4 5 6");
          System.out.println("7 8 9\n");

          System.out.println("Jogador " + jogador + " é a sua vez de jogar");
          System.out.print("Escolha uma posição: ");

          return s.nextInt();
     }

     // Verifica se a joga feita pelo o usuário é válida;
     public static boolean validacao(int posicao) {

          switch (posicao) {
               case 1:
                    return tabuleiro[0][0] == 0;
               case 2:
                    return tabuleiro[0][1] == 0;
               case 3:
                    return tabuleiro[0][2] == 0;
               case 4:
                    return tabuleiro[1][0] == 0;
               case 5:
                    return tabuleiro[1][1] == 0;
               case 6:
                    return tabuleiro[1][2] == 0;
               case 7:
                    return tabuleiro[2][0] == 0;
               case 8:
                    return tabuleiro[2][1] == 0;
               case 9:
                    return tabuleiro[2][2] == 0;

               default:
                    return false;
          }
     }

     // Exibe a mensagem se a jogada for inválida
     public static void restricao() {
          System.out.println("Jogada inválida! Tente novamente.");
     }

     // Verifica se houve empate
     public static boolean empate() {
          for (int i = 0; i < 3; i++) {
               for (int j = 0; j < 3; j++) {
                    if (tabuleiro[i][j] == 0) {
                         return false; // Ainda há posições vazias, logo não é empate;
                    }
               }
          }
          return true; // Todas as posições estão ocupadas, é empate;
     }

     // Verifica se houve vitória
     public static boolean vitoria() {

          // Verifica linhas, colunas e diagonais

          for (int i = 0; i < 3; i++) {
               if (tabuleiro[i][0] == tabuleiro[i][1] && tabuleiro[i][1] == tabuleiro[i][2] && tabuleiro[i][0] != 0)
                    return true; // verifica as linhas

               if (tabuleiro[0][i] == tabuleiro[1][i] && tabuleiro[1][i] == tabuleiro[2][i] && tabuleiro[0][i] != 0)
                    return true; // verifica as colunas
          }
          if (tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][2] && tabuleiro[0][0] != 0)
               return true; // verifica a diagonal principal
          if (tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][0] && tabuleiro[0][2] != 0)
               return true; // verifica a diagonal secundária
          return false; // Não houve vitória
     }

     // Exibe o fim do jogo
     public static void exibeFim(int resultado) {
          if (resultado == 0) {
               System.out.println("O jogo terminou em empate (velha)!");
          } else {
               System.out.println("Parabéns! O jogador " + resultado + " venceu o jogo!");
          }
     }

     // Atualiza o tabuleiro com a jogada do jogador
     public static void atualizarTabuleiro(int posicao, int jogador) {
          switch (posicao) {
               case 1:
                    tabuleiro[0][0] = jogador;
                    break;
               case 2:
                    tabuleiro[0][1] = jogador;
                    break;
               case 3:
                    tabuleiro[0][2] = jogador;
                    break;
               case 4:
                    tabuleiro[1][0] = jogador;
                    break;
               case 5:
                    tabuleiro[1][1] = jogador;
                    break;
               case 6:
                    tabuleiro[1][2] = jogador;
                    break;
               case 7:
                    tabuleiro[2][0] = jogador;
                    break;
               case 8:
                    tabuleiro[2][1] = jogador;
                    break;
               case 9:
                    tabuleiro[2][2] = jogador;
                    break;
          }
     }

}
