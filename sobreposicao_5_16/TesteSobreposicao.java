package sobreposicao_5_16;

import java.util.Date;

public class TesteSobreposicao {
    public static void main(String[] args) {
        ProdutoPerecivel pp = new ProdutoPerecivel();
        pp.descricao = "carne";
        pp.dataValidade = new Date();
        pp.identificar();
    }
}
