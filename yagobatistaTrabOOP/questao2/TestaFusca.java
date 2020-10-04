/* 
Nome: Yago batista da silva
Mat: 0050017826
*/

public class TestaFusca {
    public static void main(String[] args) {
        Fusca instance = new Fusca("WW");
        Fusca instanceFord = new Fusca("Ford");
        instance.mostrar_marca();
        System.out.println(instance);
        instance.setPotencia(200);
        instance.setVelocidade_maxima(300);
        System.out.println(instance);

        instanceFord.mostrar_marca();
        System.out.println(instanceFord);
        instanceFord.setPotencia(400);
        instanceFord.setVelocidade_maxima(600);
        System.out.println(instanceFord);

    }
}
