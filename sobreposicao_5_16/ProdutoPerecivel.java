package sobreposicao_5_16;
import java.util.Date;
public class ProdutoPerecivel extends Produto{
    protected Date dataValidade; // Date é uma bibilioteca

    public void identificar(){
        System.out.println("Minha data de validade é:" + dataValidade);
    }
}
