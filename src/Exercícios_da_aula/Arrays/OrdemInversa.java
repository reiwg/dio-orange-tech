package Exercícios_da_aula.Arrays;
/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/
public class OrdemInversa {
            public static void main(String[] args) {

               int[] vetor = {-5, -6, 15, 50, 8, 4}; // [] indica a criação do vetor, a contagem do elemento começa do 0

        //System.out.println(vetor.length);

        System.out.print("Vetor: "); //frase ilustrativa
        int count =0; // contador
        while(count < (vetor.length)) { // laco enquanto o contador for menor que o tamanho do vetor
            System.out.print(vetor[count] + " "); //vai printar o vetor na posição do count
            count++;
        }

        System.out.print("\nVetor: "); //frase ilustrativa
        for(int i = (vetor.length - 1); i >= 0; i --) { //como é a ordem inversa ele começa no tamanho do vetor -1, no caso é o 4 . "">= 0" até chegar em 0.
            System.out.print(vetor[i] + " "); // vai printar o vetor na posição i
        }

    }
}

