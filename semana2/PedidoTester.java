package semana2;

import java.util.Scanner;

/* 
    Nome: Yago batista da silva
    Mat: 0050017826

    Usando os conceitos da última aula, crie 2 classes em Java.
    1- Classe Item
    atributos ( descricao, valorUnitario, quantidade)

    2- classe Pedido:
    atributos (comprador String e valorTotal float)
    métodos:
    (adicionar - recebendo o Item como parametro)
    (mostrarValorTotal() - retorna um float com o valorTotal atual)

    3 -classe PedidoTester
    Ler 2 itens do teclado, calcular e imprimir o valorFinal calculado
    Exemplo:
    Entre com item 1: "Arroz"
    Entre com valor item 1 :  8,00
    Entre com a quantidade do item 1: 3  
    Entre com item 2: "Feijao"
    Entre com valor item 2 :  4,00
    Entre com a quantidade do item 2: 10

    Total da compra = R$64,00
*/

public class PedidoTester {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        String description;
        float price;
        Integer amount;
        Pedido order = new Pedido("yaya");

        for (int i = 1; i < 3; i++) {
            System.out.println("Entre com item " + i + ":");
            description = scan.next();
            System.out.println("Entre com valor item " + i + ":");
            price = scan.nextFloat();
            System.out.println("Entre com a quantidade do item " + i + ":");
            amount = scan.nextInt();
            order.adicionar(new Item(description, price, amount));
        }

        System.out.println("Total da compra = R$ " + order.mostrarValorTotal());
        scan.close();
    }
}
