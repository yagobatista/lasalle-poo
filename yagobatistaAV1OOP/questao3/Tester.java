/* 
Nome: Yago batista da silva
Mat: 0050017826
*/

package yagobatistaAV1OOP.questao3;

public class Tester {
    public static void main(String[] args) {
        Macbook mac = new Macbook();
        System.out.println(mac);
        System.out.println(mac.getOs());
        // testar que o metodos startOs vai setar o OS corrento
        mac.setOs("Windows");
        System.out.println("Mudou para " + mac.getOs());
        mac.startOS();
        System.out.println(mac);
        mac.turnOff();
        System.out.println(mac);
        mac.startOS();
        System.out.println(mac);
    }
}
