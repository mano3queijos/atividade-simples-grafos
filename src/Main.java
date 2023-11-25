import algoritmos.CalcTempoVetor;

public class Main {
    public static void main(String[] args) {
        System.out.println("---Tempo execução vetor 10 elementos---" );
        CalcTempoVetor.calcularTempoVetor10();

        System.out.println("---Tempo execução vetor 100 elementos---");
        CalcTempoVetor.calcularTempoVetor100();

        System.out.println("---Tempo execução vetor 1000 elementos---");
        CalcTempoVetor.calcularTempoVetor1000();

        System.out.println("---Tempo execução vetor 10000 elementos---");
        CalcTempoVetor.calcularTempoVetor10000();


    }


}