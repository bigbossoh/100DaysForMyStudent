import java.security.SecureRandom;

public class App {
    //Day 1 - Generating a random number within a specific range.
    public static final SecureRandom SECURE_RANDOM= new SecureRandom();
    public static void main(String[] args) throws Exception {
        System.out.println("Voici le nombre aléatoire sécurise entre 50 et 100");

        System.out.println(nombreAleatoireSecurise(50,100));
    }

    private static int nombreAleatoireSecurise(int mininum,int maximum){
        return SECURE_RANDOM.nextInt(maximum-mininum)+mininum;
         
    }
}
