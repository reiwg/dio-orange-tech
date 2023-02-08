package OrientacaoObjetos;

public class RodarAplicacao {

    public static void main(String[] args) {
        
        Carro carro1 = new Carro(); // Aqui foi utilizado parametro default, o usuario setou. Foi criado o objeto

        carro1.setCor("Branco");
        carro1.setModelo("Corolla");
        carro1.setCapacidadeTanque(60);

        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorDoTanque(6.19));

        Carro carro2 = new Carro("Cinza", "Bmw" , 66); // Aqui foi passados os parametros, nao precisa dos sets

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorDoTanque(6.46));
    }
    
}
