package Aula_de_metodos.Sobrecarga;


// Não tem problema métodos com nomes iguais, pois quando for chamado ele vai pro método escolhido pelos parâmetros que são passados.

public class Quadrilatero {

    public static void area(double lado) { //apenas um parametro porque o quadrado possui lados iguais

        System.out.println("Área do quadrado:" + lado * lado);
    }

    public static void area(double lado1, double lado2) {  // os lados sao diferentes

        System.out.println("Área do retângulo:" + lado1 * lado2);
    }

    public static void area(double baseMaior, double baseMenor, double altura) {

        System.out.println("Área do trapézio:" + ((baseMaior+baseMenor)*altura) / 2);
    }

    public static void area(float diagonal1, float diagonal2) {

        System.out.println("Área do losango:" + (diagonal1 * diagonal2)/2);
    }

}