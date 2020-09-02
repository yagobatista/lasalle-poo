package semana2;

/* 
    Nome: Yago batista da silva
    Mat: 0050017826

    1- Classe Item
    atributos ( descricao, valorUnitario, quantidade)

*/

public class Item {

    private final String descricao;
    private final float valorUnitario;
    private final Integer quantidade;

    public Item(final String descricao, final float valorUnitario, final Integer quantidade) {
        this.descricao = descricao;
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
    }

    public float valor() {
        return this.valorUnitario * this.quantidade;
    }

}