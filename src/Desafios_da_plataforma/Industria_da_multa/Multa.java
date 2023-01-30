package Desafios_da_plataforma.Industria_da_multa;

import java.util.Scanner;

// A prefeitura de uma cidade A instalou uma câmera para verificar quem estava acima da velocidade permitida
//  na rodovia da entrada da cidade. Porém, ela é uma cidade extremamente movimentada e 
//  a prefeitura não deu conta de enviar as multas necessárias para quem ultrapassasse a velocidade permitida de 60km/h.

// O seu papel será o de criar um programa que verifique os dados recebidos da câmera
//  e envie uma mensagem dizendo se o motorista será multado ou não.


public class Multa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Velocidade do condutor: ");
        int velocidade = scan.nextInt();

        if (velocidade > 60) {
            System.out.println("Foi multado ");
        } else {
            System.out.println("Não foi multado ");
        }
        
    }
}
