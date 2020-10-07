/* 
Nome: Yago batista da silva
Mat: 0050017826
*/

package yagobatistaAV1OOP.questao3;

public class Macbook extends Computador {
    private boolean running = false;

    @Override
    public String toString() {
        return "System: " + this.getOs() + ", is running: " + this.running;
    }

    public void startOS() {
        if (this.getOs() != "MacOS") {
            this.setOs("MacOS");
        }
        this.running = true;
    }

    public void turnOff() {
        this.setOs(null);
        this.running = false;
    }
}
