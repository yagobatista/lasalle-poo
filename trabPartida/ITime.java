package trabPartida;

public interface ITime{
    public void printNomeTime();
    public void adicionarVitoria();
    public void adicionarEmpate();
    public void adicionarDerrota();
    public int totalPontos();
    public int getVitorias();
    public int getEmpate();
    public int getDerrota();
}