/* 
Nome: Yago batista da silva
Mat: 0050017826
*/

public abstract class Veiculo {
    private Integer velocidade_maxima;
    private Integer potencia;

    @Override
    public String toString() {
        return "Veiculo tem velocidade maxima " + this.velocidade_maxima + " e potencia " + this.potencia;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public Integer getVelocidade_maxima() {
        return velocidade_maxima;
    }

    public void setVelocidade_maxima(Integer velocidade_maxima) {
        this.velocidade_maxima = velocidade_maxima;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

}
