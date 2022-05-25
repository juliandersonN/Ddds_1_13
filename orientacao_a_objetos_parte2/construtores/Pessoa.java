package orientacao_a_objetos_parte2.construtores;

public class Pessoa {
    String nome;
    int idade,cpf;
    char sexo ;
    public Pessoa(String nome) {
        this.nome= nome;
    }

    public Pessoa(String nome, int idade) {
        this(nome);
        this.idade=idade;

    }

    public Pessoa(String nome, int idade, char sexo) {
        this(nome,idade);
        this.sexo = sexo;
    }

    public Pessoa(String nome, int idade, char sexo, int cpf) {
        this(nome,idade,sexo);
        this.cpf = cpf;
    }
}