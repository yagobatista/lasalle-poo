package trabPartida;

import java.util.Arrays;
import java.util.Comparator;

public class Campeonato {

    private int totalJogos(ITime time){
        return time.getDerrota() + time.getEmpate() + time.getVitorias();
    }

    public void resultadoPartida(ITime time1, int gols1, ITime time2, int gols2) {
        if (gols1 == gols2) {
            time1.adicionarEmpate();
            time2.adicionarEmpate();
        } else if (gols1 > gols2) {
            time1.adicionarVitoria();
            time2.adicionarDerrota();
        } else if (gols2 > gols1) {
            time2.adicionarVitoria();
            time1.adicionarDerrota();
        }
    }

    public void listarRank(ITime time1, ITime time2, ITime time3, ITime time4) {
        System.out.println("************************");
        System.out.println("Classificacao Campeonato Carioca");
        System.out.println("************************");
        System.out.println("Pts Nome    Jogos Empate Vitoria Derrota");

        ITime[] times = { time1, time2, time3, time4 };
        Arrays.sort(times, new Comparator<ITime>() {
            @Override
            public int compare(ITime o1, ITime o2) {
                return o2.totalPontos() - o1.totalPontos();
            }
        });
        for (ITime time : times) {
            System.out.printf("%2s", time.totalPontos());
            System.out.print(" ");
            time.printNomeTime();
            System.out.print(" ");
            System.out.print(this.totalJogos(time));
            System.out.print("     ");
            System.out.print(time.getEmpate());
            System.out.print("      ");
            System.out.print(time.getVitorias());
            System.out.print("        ");
            System.out.print(time.getDerrota());
            System.out.println("");
        }
    }
}
