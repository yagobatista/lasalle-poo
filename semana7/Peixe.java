package semana7;

public class Peixe extends Animal {
    private String corEscama;

    public Peixe(double peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros);
        this.corEscama = corEscama;
    }

    
    @Override
    public void locamover() {
        System.out.println("nadar");
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
