package OrientacaoObjetos;
                                                                // tem uma ordem para boas práticas: 
                                                                // Atributos -> Constructor -> Seters e Geters -> Métodos

class Carro { 

    private String cor; // os atributos devem ser private
    private String modelo;
    private int capacidadeTanque;
    
    Carro (String cor, String modelo, int capacidadeTanque) {  //aqui é o constructor, tem o mesmo nome da classe 
        this.cor = cor;                                        //pode ter a overload, em que apenas os parametros mudam
        this.modelo = modelo;                                 
        this.capacidadeTanque = capacidadeTanque;

    }

    public void setCor(String cor) { // set coloca no atributo e deve ser void pois nao retorna nada
        this.cor = cor;
    }
    public String getCor() { // get retorna quando é chamado
        return cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getModelo() {
        return modelo;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;    
    }
    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public double totalValorDoTanque (double valorCombustivel) {  // isso é um método para saber o total do valor do tanque
        return capacidadeTanque * valorCombustivel;
    }


}
