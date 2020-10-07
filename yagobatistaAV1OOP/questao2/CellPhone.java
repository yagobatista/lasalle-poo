/* 
Nome: Yago batista da silva
Mat: 0050017826
*/

package yagobatistaAV1OOP.questao2;

public abstract class CellPhone {
    private boolean ligado;

    @Override
    public String toString() {
        return "celular está ligado: " + this.ligado;
    }

    public void ligar() {
        this.ligado = true;
    }

    public void desligar() {
        this.ligado = false;
    }

}
