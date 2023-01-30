package Exercícios_da_aula.Arrays;

import java.util.Random;

/*
Faça um Programa que leia 20 números inteiros (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/

public class NumeroAleatorios {
    public static void main(String[] args) {
        Random random = new Random(); //classe para gerar números aleatórios

        int[] numerosAleatorios = new int[20]; //array com 20 posições

        for(int i = 0; i < numerosAleatorios.length; i ++) {
            int numero = random.nextInt(100);  //pegando um número aleatório entre 0 e 100.
            numerosAleatorios[i] = numero; //atribuindo esse valor ao elemento na respectiva posição do array numeros
        }

        System.out.println("Números aleatórios: "); // ilustrativo
        for (int numero : numerosAleatorios) { //para cada numero dentro do array de números
            System.out.println(numero + " ");
            
        }

        System.out.println("\nSucessores dos números aleatórios: ");
        for (int numero : numerosAleatorios) {//para cada numero dentro do array de números
            System.out.println(numero+1 + " "); //adicione o valor 1 ao número e imprima esse novo valor
        }
    }


}
