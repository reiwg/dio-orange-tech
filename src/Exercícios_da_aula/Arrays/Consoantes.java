package Exercícios_da_aula.Arrays;

/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/

import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeConsoantes =0;

        int count =0;
        do {
            System.out.println("Letra: "); // entrada do usuário
            String letra = scan.next(); // vai atribuid a variável letra

            if ( !(letra.equalsIgnoreCase("a") | // "!" negativa, ou seja, quando não for ao que está escrito "A,e,i,o,u", ou seja, as consoantes
            letra.equalsIgnoreCase("e") | //"equals" é igual , "ignorecase" náo se importa se é maiúscula ou minúscula
            letra.equalsIgnoreCase("i") |
            letra.equalsIgnoreCase("o") |
            letra.equalsIgnoreCase("u")) ); {
                consoantes[count] = letra;
                quantidadeConsoantes++;
            }
            
            count++;

        } while (count < consoantes.length);

        System.out.println("Consoantes: "); //ilustrativo
        for (String consoante : consoantes ) {
            if (consoante != null); // retira o null que retornava, pois só vai mostrar o que for diferente de null
                System.out.println(consoante + " ");
        }

    }
}
