package trabPartida;

public class Vasco extends TimeDeFutebol implements ITime{
    private String nome;
    private int qtdVitoria;
    private int qtdEmpate;
    private int qtdDerrota;

    Vasco(){
        this.nome = "Vasco";
    }

    @Override
    public void printNomeTime() {
        System.out.printf("%10s", this.nome);
    }

    @Override
    public void adicionarVitoria() {
        this.qtdVitoria++;

    }

    @Override
    public void adicionarEmpate() {
        this.qtdEmpate++;
    }

    @Override
    public void adicionarDerrota() {
        this.qtdDerrota++;
    }

    @Override
    public int totalPontos() {
        return (this.qtdVitoria * 3) + this.qtdEmpate;
    }

    @Override
    public int getVitorias() {
        return this.qtdVitoria;
    }

    @Override
    public int getEmpate() {
        return this.qtdEmpate;
    }

    @Override
    public int getDerrota() {
        return this.qtdDerrota;
    }
}
