/*
Faça um programa que peça X números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/


package Exercícios_da_aula.Loops;

import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
    
    
        Scanner scan = new Scanner(System.in);

        int quantidadeImpares = 0;
        int quantidadePares = 0;

        System.out.println("Quantos numeros voce quer");
        int quantidadeNumeros = scan.nextInt();


        for (int i = 0; i < quantidadeNumeros; i++) {
            System.out.println("Qual numero quer saber?");
            int numeroDesejado = scan.nextInt();

            if (numeroDesejado % 2 == 0 ) {
                quantidadePares++;
    
            } else {
                quantidadeImpares++;
            }
            
        }
        
        System.out.println("Sua quantidade de numeros pares: " + quantidadePares);
        System.out.println("Sua quantidade de numeros impares: " + quantidadeImpares);
    }
    
}

