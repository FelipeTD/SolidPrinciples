package ocp.goodExample;

// Menos importação de código
// Se for adicionado uma PJ não terá modificação no código
// Um bom exemplo do Princípio Aberto Fechado
public class FolhaDePagamento {

    public Double calcularSalario(Remuneravel funcionario) {

        Double saldo = Double.MIN_VALUE;
        saldo = funcionario.remuneracao();

        return saldo;

    }

}
