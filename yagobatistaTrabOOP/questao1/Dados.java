/* 
Nome: Yago batista da silva
Mat: 0050017826
*/
public class Dados {

    public void mostrar(Integer valor){
        String numeroTipo = valor % 2 == 0 ? "par" : "impara";
        System.out.println("O numero é " + numeroTipo);
    }
    public void mostrar(String valor){
        System.out.println(valor.length());
    }
}