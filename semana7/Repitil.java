package semana7;

public class Repitil extends Animal {
    private String corEscama;

    public Repitil(double peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros);
        this.corEscama = corEscama;
    }

    @Override
    public void locamover() {
        System.out.println("Andar");
    }

    @Override
    public void alimentar() {
        System.out.println("Comer");
    }

    @Override
    public void emitirSom() {
        System.out.println("Faz som");

    }
}
