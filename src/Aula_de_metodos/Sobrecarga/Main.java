package Aula_de_metodos.Sobrecarga;

public class Main {
    public static void main(String[] args) { // aqui foi feito pelo void
        
        //quadrilatero
        Quadrilatero.area(3);
        Quadrilatero.area(5, 5);
        Quadrilatero.area(7, 8, 9);

        // atribuindo a uma variável o método

        double areaQuadrado = Atribuindo_a_variavel.area(3);
        System.out.println("Área do quadrado é: " + areaQuadrado );

        double areaRetangulo = Atribuindo_a_variavel.area(5, 5);
        System.out.println("Área do retânguloÇ " + areaRetangulo);

        double areaTrapezio = Atribuindo_a_variavel.area(6, 7, 8);
        System.out.println("Área do trapézio é: " + areaTrapezio);
    }
    
}


