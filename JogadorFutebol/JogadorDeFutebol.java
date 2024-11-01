package JogadorFutebol;

public class JogadorDeFutebol {

     private String nome; 
     public String posicao, nacionalidade;
     public double altura, peso;
     public int nascimento;

     public JogadorDeFutebol(String nome, String posicao, String nacionalidade, double altura, double peso, int nascimento) {

          this.nome = nome;
          this.nacionalidade = nacionalidade;
          this.posicao = posicao;
          this.altura = altura;
          this.peso = peso;
          this.nascimento = nascimento;
     }

     public int calculaIdade() {

          int nascimentoAtual = 2024;
          int idade = nascimentoAtual - nascimento;

          return idade;
     }

     public String exibeJogador() {

          String exibicao = "Nome: " + nome + "\n ano: " + nascimento + "\n Altura: " + altura + "\n Peso: " + peso + "\n Nacionalidade: " + nacionalidade + "\n Posição: " + posicao;

          return exibicao;
     }

     public String getNome(){
          
          return nome;
     }

}
