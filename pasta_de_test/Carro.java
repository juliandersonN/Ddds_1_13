package pasta_de_test;

public class Carro {
    String Nome;
    String Fabricante;
    String Cor;
    int numPassageiro;
    double capGasolina;
    double distaPercorriComGasolina=12.0;

    double calculaDistanciaPercorrida(){
        return capGasolina * distaPercorriComGasolina;
    }
}

