package JogadorFutebol;

import java.util.Scanner;

public class App {

     static Scanner s = new Scanner (System.in);

     public static void main(String[] args) {

          JogadorDeFutebol dadosJogador = null;
          dadosJogador = leDados();
          tempoAposentadoria(dadosJogador);
          
     }

     public static JogadorDeFutebol leDados(){

          String nome, posicao, nacionalidade;
          double altura, peso;
          int ano = 0; 

          System.out.println("Digite o seu nome: ");
          nome = s.nextLine();

          System.out.println("Digite a sua altura: ");
          altura = s.nextDouble();

          System.out.println("Digite o seu peso: ");
          peso = s.nextDouble();

          System.out.println("Digite o ano de seu nascimento: ");
          ano = s.nextInt();

          s.nextLine(); // Limpa o Scanner;

          System.out.println("Digite a nacionalidade: ");
          nacionalidade = s.nextLine();

          do {
               
               System.out.println(" \n ------ Escolha sua posição ------ ");
               System.out.println("\n > Atacante \n > Defesa \n > Meio campista");
               System.out.print(" >");
               posicao = s.nextLine();
               
          } while(!posicao.equals("Atacante") && !posicao.equals("Defesa") && !posicao.equals("Meio campista"));

          JogadorDeFutebol dadosJogador = new JogadorDeFutebol(nome, posicao, nacionalidade, altura, peso, ano);

          return dadosJogador; 

     }    

     public static void tempoAposentadoria(JogadorDeFutebol dadosJogador){

          int anosRestantes = 0; 

          if(dadosJogador.posicao.equals("Atacante")){
               anosRestantes = 35 - dadosJogador.calculaIdade();
          }
          else if(dadosJogador.posicao.equals("Defesa")){
               anosRestantes = 40 - dadosJogador.calculaIdade();
          }
          else if(dadosJogador.posicao.equals("Meio campista")){
               anosRestantes = 38 - dadosJogador.calculaIdade();
          }else{
               System.out.println("Mensagem inválida");
          }

          System.out.println("Faltam " + anosRestantes + " para o jogador " + dadosJogador.getNome() + " se aposentar.");

     }  
}