package ocp.badExample;

// Conforme o OCP é um código ruim.
// Para se adicionar um novo tipo, por exemplo, PJ
// É necessário aumentar o IF e modificar a classe FolhaDePagamento
// Se modifica vai contra o princípio
// Pela lógica deveria extender
public class FolhaDePagamento {

    public Double calcularSalario(Object funcionario) {

        Double saldo = Double.MIN_VALUE;
        if (funcionario instanceof ContratoCLT clt) {
            saldo = clt.salario();
        } else if (funcionario instanceof Estagio estagiario) {
            saldo = estagiario.bolsaAuxilio();
        }

        return saldo;

    }

}
