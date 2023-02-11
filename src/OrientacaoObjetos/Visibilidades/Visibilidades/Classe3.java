package OrientacaoObjetos.Visibilidades.Visibilidades;

class Classe3 { // nao herda de classe 1 "Extends"
    Classe1 classe1;

    void metodo() {
        // classe1.atributo2; // pode usar o protected pois esta no mesmo pacote
        // classe1.atributo3; //public pode usar em qualquer lugar
    }
}
