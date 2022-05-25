package ddd;

import static ddd.SituacaoConta.*;

public class ContaPagar {
    SituacaoConta situacaoConta;
    String descricao;
    Double valor;
    String dataVencimento;
    Fornecedor fornecedor;

    public ContaPagar() {
        this.situacaoConta = PENDENTE;
    }

    public ContaPagar(Fornecedor fornecedor, String descricao, double valor, String dataVencimento) {
        this.fornecedor = fornecedor;
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
    }

    public SituacaoConta getSituacaoConta() {
        return situacaoConta;
    }

    public void pagar() {
        if (this.situacaoConta == PAGA) {
            System.out.println("SITUAÇÃO DA CONTA É " + this.situacaoConta + "IMPOSSIBILITADO DE PAGAR!");
            return;
        }
        if (this.situacaoConta == CANCELADA) {
            System.out.println("INFELIZMENTE, SUA SITUAÇÃO DE SUA CONTA É " + this.situacaoConta + "ESTÁ CANCELADA");
            return;
        }
        this.situacaoConta = PAGA;
        System.out.println("SUA CONTA ESTÁ PAGA ");
    }

    public void cancelar() {
        if ((this.situacaoConta == PAGA) || (this.situacaoConta == CANCELADA)) {
            System.out.println("NÃO PODE, PORQUE SUA CONTA FOI CANCELADA, OU PAGA!");
        }
        this.situacaoConta = CANCELADA;
        System.out.println("INFELISMENTE, SUA CONTA FOI CANCELADA");
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
}
