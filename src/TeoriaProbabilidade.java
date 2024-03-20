import java.util.Random;

public class TeoriaProbabilidade {
    public static void main (String[]args){
        Random rand = new Random();

        int jogadas = 1000;
        int cara = 0;
        int coroa = 0;

        for(int i = 0; i < jogadas; i++){
            int num = rand.nextInt(2);

            if (num == 1) coroa ++;
            else cara ++;
        }

        double percentCara = ((double) cara / jogadas) * 100;
        double percentCoroa = ((double) coroa / jogadas) * 100;

        System.out.println("Cara :" + String.format("%.2f", percentCara) + " %");
        System.out.println("Coroa :" + String.format("%.2f", percentCoroa) + " %");
    }
}
