package Encapsulamento;

import java.util.Scanner;

public class app {
     static Scanner s = new Scanner(System.in);

     public static void main(String[] args) {

          // Declaração de variáveis;
          int idade, opcao;

          pessoa p = null;
          formacao f = null;

          do {
               System.out.println("\n MENU DE OPÇÕES");
               System.out.println("1 - Cadastrar Pessoa");
               System.out.println("2 - Cadastrar Formação");
               System.out.println("3 - Exibir");
               System.out.println("4 - Atualizar idade");
               System.out.println("5 - Sair");
               System.out.println();
               System.out.print("Digite uma opção: ");
               opcao = s.nextInt();

               switch (opcao) {
                    case 1:
                         p = lePessoa();
                         break;
                    case 2:
                         f = leFormacao();
                         break;
                    case 3:
                         if (p != null) {
                              System.out.println(p.exibe());
                         } else {
                              System.out.println("Não possui pessoas cadastradas! \n");
                         }
                         if (f != null) {
                              System.out.println(f.exibe());
                         } else {
                              System.out.println("Não possui formação cadastradas!");
                         }
                         break;
                    case 4:
                         if (p != null) {
                              System.out.println("Digite a idade corrigida: ");
                              idade = s.nextInt();
                              p.idade = idade;
                              System.out.println(" \n Idade atualizada com sucesso! \n");
                         } else {
                              System.out.println("Não possui pessoas cadastradas! \n");
                         }
                         break;
               }

          } while (opcao != 5);

     }

     public static pessoa lePessoa() {

          String nome;
          char sexo;
          int idade;

          s.nextLine(); // Limpa o Scanner antes de ler o nome; (Aprendizado da aula de Algoritmos).

          System.out.println("Digite seu nome: ");
          nome = s.nextLine();

          System.out.println("Digite seu sexo (M/F): ");
          sexo = s.next().charAt(0);

          System.out.println("Digite sua idade: ");
          idade = s.nextInt();

          pessoa p = new pessoa(nome, sexo, idade);

          return p;
     }

     public static formacao leFormacao() {

          String nivel, instituicao, respostaConcluido;
          boolean concluido = false;
          int ano = 0;

          s.nextLine();

          System.out.println("Digite o nível de escolaridade: ");
          nivel = s.nextLine();

          System.out.println("Você concluíu a sua formação? (sim ou nao)");
          respostaConcluido = s.nextLine();

          if (respostaConcluido.equals("sim")) {
               concluido = true;
          } else if (respostaConcluido.equals("nao")) {
               concluido = false;
          } else {
               System.out.println("Resposta inválida");
          }

          System.out.println("Digite a instituição: ");
          instituicao = s.nextLine();

          if (concluido == true) {
               System.out.println("Ano conclusão: ");
               ano = s.nextInt();
          }


          
          formacao f = new formacao(nivel, instituicao, concluido, ano);

          return f;
     }

}