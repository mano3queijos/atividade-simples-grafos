
package algoritmos;

import java.util.Vector;
import java.util.concurrent.TimeUnit;

public class CalcTempoVetor {
    static Vector<String> vec = new Vector<>();
    public static void calcularTempoVetor10(){
        long start = System.nanoTime();
        int n = 10;
        for(int i =1; i<=n; i++){
            vec.add(Integer.toString(i));
        }
        String p = vec.get(n-1);
        imprimirTempo(start, System.nanoTime());
    }

    public static void calcularTempoVetor100(){
        long start = System.nanoTime();
        int n = 100;
        for(int i =1; i<=n; i++){
            vec.add(Integer.toString(i));
        }
        String p = vec.get(n-1);
        imprimirTempo(start, System.nanoTime());
    }

    public static void calcularTempoVetor1000(){
        long start = System.nanoTime();
        int n = 1000;
        for(int i =1; i<=n; i++){
            vec.add(Integer.toString(i));
        }
        String p = vec.get(n-1);
        imprimirTempo(start, System.nanoTime());
    }

    public static void calcularTempoVetor10000(){
        long start = System.nanoTime();
        int n = 10000;

        for(int i =1; i<=n; i++){
            vec.add(Integer.toString(i));
        }
        String p = vec.get(n-1);
        imprimirTempo(start, System.nanoTime());
    }

    private static void imprimirTempo(Long start, Long currentNs){
        long elapsedTimeInNs = currentNs - start;
        double elapsedTimeInSeconds = TimeUnit.SECONDS.convert(elapsedTimeInNs, TimeUnit.NANOSECONDS);
        System.out.println("Tempo decorrido: " + elapsedTimeInNs + " ns ou " + elapsedTimeInSeconds + " s");
    }
}
