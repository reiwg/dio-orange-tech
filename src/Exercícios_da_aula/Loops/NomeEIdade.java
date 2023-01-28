/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/

package Exercícios_da_aula.Loops;

import java.util.Scanner;

public class NomeEIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade ;

        System.out.println("Qual seu nome? ");
        nome = scan.next ();

        System.out.println("Qual sua idade? ");
        idade = scan.nextInt();

        
        
        if (idade >= 0) ;
            else return;
        

    }
    
}
