package ddd;
    /*
1 - Crie uma enumeração chamada SituacaoConta com as seguintes constantes: PENDENTE, PAGA e CANCELADA.
2 - Inclua um atributo chamado "situacaoConta" do tipo SituacaoConta na classe ContaPagar.
3 - O atributo "situacaoConta" deve possuir apenas o método getter.
O setter não deve existir por questões de segurança.
4 - Ninguém pode pagar uma conta simplesmente mudando a situação dela, mas deve sempre passar pelo método pagar().
5 - No construtor padrão (o que não recebe parâmetros) da classe ContaPagar, atribua a constante PENDENTE
(da SituacaoConta) à variável "situacaoConta", assim, todas as contas a pagar instanciadas ficarão com
o status PENDENTE por padrão.
No construtor que recebe os parâmetros, lembre de invocar o construtor padrão usando a instrução this(),
pois também neste caso é importante que a "situacaoConta" seja definida com a constante PENDENTE.
O método pagar() deve verificar a situação da conta antes de efetivar o pagamento. Se a situação for
CANCELADA ou PAGA, uma mensagem de erro deve ser exibida ao usuário.
 Uma conta só deve ser paga se a situação atual for PENDENTE.
No caso de uma conta ser paga através do método pagar(), não esquecer de atribuir a constante PAGA à variável
"situacaoConta".
Crie um método cancelar() na classe ContaPagar que muda a situação da conta para CANCELADA e exibe uma mensagem para
o usuário. A regra neste caso é a seguinte: não se pode cancelar uma conta que já foi cancelada ou paga.
Ok, seu analista lhe deu muito trabalho, mas pense como isso será útil para você aprender sobre as enumerações,
pacotes e, claro, praticar Java. :)
Quando terminar todas as solicitações do analista, modifique a classe Principal do desafio anterior para o
código-fonte abaixo, compile tudo e execute.

Preste bastante atenção se todas as regras estão sendo executadas corretamente. Só para lembrar:
Uma conta que já foi paga não pode ser paga novamente e nem cancelada.
Uma conta que já foi cancelada não pode ser cancelada novamente e nem paga.
Boa sorte!
 */
    public class Principal {

        public static void main(String[] args) {
            Fornecedor imobiliaria = new Fornecedor();
            imobiliaria.setNome("Casa & Cia Negócios Imobiliários");
            Fornecedor mercado = new Fornecedor();
            mercado.setNome("Mercado do João");
            ContaPagar conta1 = new ContaPagar();
            conta1.setDescricao("Aluguel da matriz");
            conta1.setValor(1230d);
            conta1.setDataVencimento("10/05/2012");
            conta1.setFornecedor(imobiliaria);
            ContaPagar conta2 = new ContaPagar(mercado, "Compras do mês", 390d, "19/05/2012");
            ContaPagar conta3 = new ContaPagar(mercado, "Aluguel da filial", 700d, "11/05/2012");
            // pagamento de conta pendente (ok, deve funcionar)
            conta1.pagar();
            // tentativa de pagar uma conta cancelada (não deve aceitar pagamento)
            conta2.cancelar();
            conta2.pagar();
            // tentativa de pagar uma conta duas vezes (não deve aceitar na segunda vez)
            conta3.pagar();
            conta3.pagar();
        }
    }