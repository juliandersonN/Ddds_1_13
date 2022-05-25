package heranca_e_modificador_protected_5_14;

public class Pessoa {
    String nome;
    protected int idade;
    public void seApresentar(){
        System.out.println("ola ,eu sou o," + nome +", e tenho" + idade + "anos.");
    }
}
