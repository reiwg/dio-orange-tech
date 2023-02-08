package Aula_de_metodos;

public class Calculadora {
    
    public static void soma (double numero1 , double numero2){
        double resultado = numero1 + numero2;
        System.out.println("O resultado do " + numero1 + " somado com o número " + numero2 + " É " + resultado );
    }

    public static void subtracao (double numero1 , double numero2) {
        double resultado = numero1 - numero2;
        System.out.println("O resultado da subtração do " + numero1 + " com o número " + numero2 + " é " + resultado);
    }

    public static void multiplicacao (double numero1 , double numero2) {
        double resultado = numero1 * numero2;
        System.out.println("A multiplicação do número " + numero1 + " com o " + numero2 + " é " + resultado);
    }

    public static void divisao (double numero1 , double numero2){
        double resultado = numero1 / numero2;
        System.out.println("A divisão do número " + numero1 + " com o número " + numero2 + " é " + resultado);
    }
}
