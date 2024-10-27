package Encapsulamento;

public class formacao {
     
     public String nivel, instituicao; 
     public boolean concluido;
     public int ano;

     public formacao (String nivel, String instituicao, boolean concluido, int ano){

          this.nivel = nivel;
          this.instituicao = instituicao;
          this.concluido = concluido;
          this.ano = ano;
     }

     public String exibe (){

          String s;

          s = "Nível: " + nivel + "\n Instituição: " + instituicao + "\n Concluído? " + concluido + "\n Ano conclusão: " + ano + "\n";

          return s; 
     }
}
