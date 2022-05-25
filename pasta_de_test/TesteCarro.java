package pasta_de_test;

import java.util.Scanner;

public class TesteCarro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro chevrolet = new Carro();
        chevrolet.Nome ="Onix";
        chevrolet.Fabricante="Chevrolet";
        chevrolet.Cor="Branco";
        chevrolet.numPassageiro = 4;
        System.out.print("Quantos litros deseja abastecer?");
        chevrolet.capGasolina = scanner.nextDouble();
        System.out.println("O CARRO " + chevrolet.Nome + "DA FABRICANTE " + chevrolet.Fabricante);
        System.out.println("COM A COR " + chevrolet.Cor);
        System.out.print(" percorre com " + chevrolet.capGasolina + " aproximadamente " + chevrolet.calculaDistanciaPercorrida()+" KM");
    }

}