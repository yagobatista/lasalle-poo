package semana2;

/* 
    Nome: Yago batista da silva
    Mat: 0050017826

    2- classe Pedido:
    atributos (comprador String e valorTotal float)
    métodos:
    (adicionar - recebendo o Item como parametro)
    (mostrarValorTotal() - retorna um float com o valorTotal atual)

*/

public class Pedido {
    private String comprador;
    private float valorTotal;

    public Pedido(String comprador) {
        this.comprador = comprador;
    }

    public void adicionar(Item item){
        this.valorTotal += item.valor();
    }

    public float mostrarValorTotal() {
        return this.valorTotal;
    }
}
