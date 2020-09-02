package semana1;

/* 
Nome: Yago batista da silva
Mat: 0050017826
*/
import java.util.Scanner;

public class Ex2SeuNome {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número:");
        Integer number = scan.nextInt();

        Boolean isEven = number % 2 == 0;
        String numberType = isEven ? "par" : "impar";

        System.out.println("O numero " + number + " é " + numberType);

        scan.close();
    }
}