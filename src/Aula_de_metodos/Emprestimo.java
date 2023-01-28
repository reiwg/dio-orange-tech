package Aula_de_metodos;

public class Emprestimo {
    
    public static int duasParcelas() {
        return 2;
    }

    public static int tresParcelas(){
        return 3;
    }

    public static double taxaDuasParcelas () {
        return  0.3;
    }
    
    public static double taxaTresParcelas () {
        return 0.45;
    }
    
    public static void calcular (int valor,int parcelas){

        if (parcelas == 2) {

            double valorFinal = valor + (valor * taxaDuasParcelas());

            System.out.println("Valor final do empréstimo para duas parcelas: " + valorFinal );
            
        } else if (parcelas == 3) {

            double valorFinal = valor + (valor * taxaTresParcelas());

            System.out.println("Valor final do empréstimo para três parcelas " + valorFinal );
        } else {
            System.out.println("Quantidade de parcelas não aceita");
        }
    }
    
}
