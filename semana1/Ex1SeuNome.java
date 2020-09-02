package semana1;

/* 
Nome: Yago batista da silva
Mat: 0050017826
*/
import java.util.Scanner;

public class Ex1SeuNome {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer number;

        do {
            System.out.println("Digite um número de 0 a 9");
            number = scan.nextInt();
        } while (number < 0 || number > 9);

        for (int i = 0; i < 11; i++) {
            System.out.println(i + " : " + (number * i));
        }

        scan.close();
    }
}