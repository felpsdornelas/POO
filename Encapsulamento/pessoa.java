package Encapsulamento;

public class pessoa {
     
     public String nome;
     public char sexo;
     public int idade;

     public pessoa (String nome, char sexo, int idade){

          this.nome = nome;
          this.sexo = sexo; 
          this.idade = idade;
     }

     public String exibe (){

          return "\n Nome: " + nome + "\n Sexo: " + sexo + "\n Idade: " + idade + "\n";
     }
}
