package ExemploEstatico;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

     static Scanner s = new Scanner (System.in);

     public static void main(String[] args) {

          FichaPessoal dadosPessoais;

          List<FichaPessoal> cadastro = new ArrayList<>();
          char resposta;
          do{
               cadastro.add(leDados());
               System.out.println("Deseja cadastrar novamente? (S/N)");
               resposta = s.next().charAt(0);
          }while(resposta == 's' || resposta == 'S');

          exibe(cadastro);
   
     }

     public static FichaPessoal leDados(){

          String nome;
          int idade;

          System.out.println("Digite seu nome: ");
          nome = s.next();

          System.out.println("Digite sua idade: ");
          idade = s.nextInt();

          FichaPessoal dadosPessoais = new FichaPessoal(nome, idade);

          return dadosPessoais;

     }

     public static void exibe(List<FichaPessoal> cadastro){

          for(FichaPessoal dadosJogador : cadastro){
               System.out.println("Nome: " + dadosJogador.getNome() + " Idade: " + dadosJogador.getIdade());
          }
     }
}