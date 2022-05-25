package orientacao_a_objetos_parte2.construtores;

public class TesteConstrutor {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("João",10,'M',123456789);
        System.out.println("Nome: \"" + p1.nome + "\",tem " + p1.idade+ " anos,"+"sexo "+p1.sexo + " ,CPF:" + p1.cpf);
        Pessoa p2 = new Pessoa("maria", 22,'F');
        System.out.println("Nome: \"" + p2.nome + "\" ,tem " + p2.idade + " anos,"+"sexo "+p2.sexo);

    }
}