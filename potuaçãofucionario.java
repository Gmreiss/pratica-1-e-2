import java.util.Scanner;

public class potuaçãofucionario {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe a pontuação do fucionario: ");
        double pontuacao = ler.nextDouble();
        if ( pontuacao >= 0 && pontuacao <= 49) {
            System.out.println("Desempenho: Insatifatório ");
            } else if (pontuacao >= 50 && pontuacao <= 69) {
               System.out.println("Desempento: Regular "); 
             }else if (pontuacao >=70 && pontuacao <=89 ) {
                System.out.println("Desempenho: Bom");
             }else if (pontuacao >=90 && pontuacao <=100 ) {
                System.out.println("Desempenho: Bom");
             }else{
                System.out.println("Pontuação Invalida");
             }
        ler.close();
    }
}
