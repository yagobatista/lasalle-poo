/* 
Nome: Yago batista da silva
Mat: 0050017826
*/

public abstract class Conta {
    private Integer agencia;
    private Integer agenciaDigito;
    private Integer conta;
    private String contaDigito;

    Conta(Integer agencia, Integer agenciaDigito, Integer conta, String contaDigito) {
        this.agencia = agencia;
        this.agenciaDigito = agenciaDigito;
        this.conta = conta;
        this.contaDigito = contaDigito;
    }

    Conta(Integer agencia, Integer conta, String contaDigito) {
        this.agencia = agencia;
        this.conta = conta;
        this.contaDigito = contaDigito;
    }

    public void transferir(double valor, Integer agencia, Integer agenciaDigito, Integer conta, String contaDigito) {
        System.out.println("Valor " + valor + " transferido");
    }

    public void transferir(double valor, Integer agencia, Integer conta, String contaDigito) {
        System.out.println("Valor " + valor + " transferido");
    }

    public void transferir(double valor, Conta recebedora) {
        System.out.println("Valor " + valor + " transferido");
    }

}
