package semana7;

public class Canguru extends Mamifero {

    public Canguru(double peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
    }

    @Override
    public String toString() {
        return "Peso: " + this.peso + " Idade: " + this.idade + " Membros: " + this.membros + " Cor: " + this.corPelo;
    }

    @Override
    public void locamover() {
        System.out.println("Pular");
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
