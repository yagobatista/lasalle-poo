/* 
    Nome: Yago batista da silva
    Mat: 0050017826
*/

package trabPartida;

public class PartidaTester {
    public static void main(String[] args) {
        Flamengo fla = new Flamengo();
        Botafogo bot = new Botafogo();
        Fluminense flu = new Fluminense();
        Vasco vas = new Vasco();
        Campeonato cap = new Campeonato();
        // empates
        cap.resultadoPartida(bot, 2, fla, 2);
        cap.resultadoPartida(bot, 2, vas, 2);
        cap.resultadoPartida(bot, 2, vas, 2);
        cap.resultadoPartida(bot, 2, vas, 2);

        cap.resultadoPartida(flu, 3, vas, 2);
        cap.resultadoPartida(flu, 2, fla, 3);
        cap.resultadoPartida(flu, 2, fla, 3);
        cap.resultadoPartida(flu, 2, fla, 3);

        cap.listarRank(fla, flu, bot, vas);
    }
}
