/* 
Nome: Yago batista da silva
Mat: 0050017826
*/

public class Carro extends Veiculo {
    protected String marca;

    Carro(String marca) {
        this.setVelocidade_maxima(150);
        this.setPotencia(130);
        this.marca = marca;
    }

    public void mostrar_marca() {
        System.out.println(this.marca);
    }
}
