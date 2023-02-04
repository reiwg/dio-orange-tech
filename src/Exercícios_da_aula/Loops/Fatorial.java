/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/


package Exercícios_da_aula.Loops;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual numero quer calcular fatorial? ");
        int numeroEscolhido = scan.nextInt();

        int resultado = 1;
        for (int i = numeroEscolhido; i > 1; i--) {           
            resultado *= i;

            System.out.println(resultado);
        }
        System.out.println("\nSeu resultado: " + resultado);
    
    }

}
