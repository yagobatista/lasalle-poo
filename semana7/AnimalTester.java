package semana7;

/* 
    Nome: Yago batista da silva
    Mat: 0050017826
    
    Trabalho:
        1-Implemente todos os métodos do projeto de acordo com o diagrama de classes abaixo
        2-Crie uma classe Canguru herdando de Mamifero e implemente um polimorfismo nos 3 métodos da classe Animal
        3- Crie uma classe AnimalTester para testar todos os métodos e atributos

*/

public class AnimalTester {
    public static void main(String[] args) {
        Canguru canguru = new Canguru(40.0, 2, 4, "preto");
        Canguru canguruPesado = new Canguru(60.0, 2, 4, "preto");
        Canguru canguruVelho = new Canguru(40.0, 10, 4, "preto");
        Canguru canguruAmputado = new Canguru(40.0, 2, 3, "preto");
        Canguru canguruBranco = new Canguru(40.0, 2, 4, "branco");
        canguru.locamover();
        canguru.alimentar();
        canguru.emitirSom();
        System.out.println(canguru);
        System.out.println(canguruPesado);
        System.out.println(canguruVelho);
        System.out.println(canguruAmputado);
        System.out.println(canguruBranco);
    }
}
