/* 
Nome: Yago batista da silva
Mat: 0050017826
*/

public class ContaCorrente extends Conta {

    ContaCorrente(Integer agencia, Integer conta, String contaDigito) {
        super(agencia, conta, contaDigito);
    }

    public void transferir(double valor, Conta conta){
        if(!(conta instanceof ContaCorrente)) {
            super.transferir(valor, conta);
        } else {
            System.out.println("Conta corrente so pode fazer transferencia para outra conta corrente");
        }
    }
}
