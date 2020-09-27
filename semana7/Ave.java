package semana7;

public class Ave extends Animal {
    private String corPena;

    public Ave(double peso, int idade, int membros, String corPena) {
        super(peso, idade, membros);
        this.corPena = corPena;
    }

    public void fazerNinho() {
        System.out.println("Faz ninho!!!");
    }

    @Override
    public void locamover() {
        System.out.println("Voar");
    }

    @Override
    public void alimentar() {
        System.out.println("Comer semente");
    }

    @Override
    public void emitirSom() {
        System.out.println("Faz som");

    }
}
