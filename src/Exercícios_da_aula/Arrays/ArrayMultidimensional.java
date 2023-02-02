package Exercícios_da_aula.Arrays;

import java.util.Random;

// Gere e imprima uma matriz M 4x4 com valores aleatórios

public class ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int [][] M = new int [4][4]; //O foi criada a matriz e o primeiro sao as linhas e o segundo as colunas

        for(int i = 0;  i < M.length; i++) { // aqui está pegando a primeira linha da matriz
            for(int j = 0; j < M[i].length; j++) { // vai percorrer os números de cada linha, ou seja, por coluna 
                M[i][j] = random.nextInt(9); // aqui ele vai colocar um número random em cada um
            }
        }

        System.out.println("Matriz: ");
        for (int[] linha : M ) {  
            for (int coluna : linha) {
                System.out.println(coluna);
                
            }
            System.out.println();
        }
    }
}
