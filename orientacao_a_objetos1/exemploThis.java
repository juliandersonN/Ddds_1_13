package orientacao_a_objetos1;
public class exemploThis  {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Proprietario dono = new Proprietario();
        carro.modelo ="palio";

        System.out.println("Modelo antes:" + carro.modelo);

        carro.alterarModelo("civic");
        System.out.println("Modelo depois " + carro.modelo);
        System.out.print("O novo dono é:" + dono.nome);
        System.out.print("Com o CPF :" + dono.cpf);
    }
}
