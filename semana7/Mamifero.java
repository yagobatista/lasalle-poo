package semana7;

public class Mamifero extends Animal {
    protected String corPelo;

    public Mamifero(double peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros);
        this.corPelo = corPelo;
    }

    @Override
    public void locamover() {
        System.out.println("Andar");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamar");
    }

    @Override
    public void emitirSom() {
        System.out.println("Faz som");

    }
}
