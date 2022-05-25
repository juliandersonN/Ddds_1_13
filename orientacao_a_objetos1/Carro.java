package orientacao_a_objetos1;

public class Carro {
    String fabricante;
    String modelo;
    int anodeFabricacao;
    boolean biCombustivel;

     void alterarModelo(String modelo){
         if (modelo != null){
             this.modelo = modelo;
         }
     }
     void ligar(){
         if(modelo != null){
             System.out.println("ligando o carro:" + modelo);
         }
     }
}
