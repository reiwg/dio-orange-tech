package OrientacaoObjetos.Interface;


public class Calculadora implements OperacaoMatematica { // calculadora implemanta a interface OperacaoMatematica
           //aqui esta sobrescrevendo os metodos existenter na interface OperacaoMatematica
    public void soma(double operando1, double operando2) {
        System.out.println("Soma: " + operando1 + operando2);        
    }

    
    public void subtracao(double operando1, double operando2) {
        System.out.println("Subtracao: " + (operando1 - operando2));
    }

    
    public void multiplicacao(double operando1, double operando2) {
        System.out.println("multiplicacao: " + operando1 * operando2);
    }

    
    public void divisao(double operando1, double operando2) {
        System.out.println("multiplicacao: " + operando1 / operando2);
        
    }

}

