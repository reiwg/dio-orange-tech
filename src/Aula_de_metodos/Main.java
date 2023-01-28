package Aula_de_metodos;

public class Main {
    public static void main(String[] args) {

        // Eesultado da soma
        System.out.println("Exercícios da calculadora ");
        Calculadora.soma (3, 5);
        Calculadora.subtracao(5, 3);
        Calculadora.multiplicacao(5, 5);
        Calculadora.divisao(10, 2);

        // Eensagem
        System.out.println("Exercício da mensagem ");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(21);

        // Empréstimo
        System.out.println("Exercícios empréstimo ");
        Emprestimo.calcular(1000, Emprestimo.duasParcelas()); // É possível colocar outro método para fazer o retorno de um valor que já está feito dentro do método
        Emprestimo.calcular(1000, Emprestimo.duasParcelas());
        Emprestimo.calcular(1000, 5);
    }
    
    
}
