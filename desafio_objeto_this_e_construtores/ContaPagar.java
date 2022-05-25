package desafio_objeto_this_e_construtores;

public class ContaPagar {
    String descricao;
    double valor;
    String dataVencimento;
    String fornecedor;

    ContaPagar(Fornecedor mercado, String aluguel_da_filial, double v, String s){
    }
    public void descricao(String descricao){

        this.descricao=descricao;
    }
    public void valor(String escricao,int valor){

        this.valor=valor;
    }
    public void DataVencimento(String descricao, double valor,String dataVencimento){
        this.dataVencimento=dataVencimento;
    }

    public void fornecedor(String fornecedor){

        this.fornecedor= fornecedor;
    }

    public void setDescricao(String Descricao) {

    }

    public void setValor(double valor) {
    }

    public void setDataVencimento(String DataVencimento) {
    }

    public void setFornecedor(Fornecedor imobiliaria) {
    }

    public void pagar() {
    }
}
