/* 
Nome: Yago batista da silva
Mat: 0050017826
*/

package yagobatistaAV1OOP.questao2;

public class IAndroidTester {
    public static void main(String[] args) {
        IAndroid android = new IAndroid();
        android.ligar();
        System.out.println(android);
        android.desligar();
        System.out.println(android);
        android.ligar();
        System.out.println(android);
        android.mostrar_marca();
    }
}
