import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yuan = scanner.nextInt();
        final double ROUBLES_PER_YUAN = 11.91;
        double roubles = ROUBLES_PER_YUAN * yuan;
        int digit = yuan % 10;
        int twodigits = yuan % 100;
        if (twodigits >= 11 && twodigits <= 14) {
            System.out.println(yuan + " юаней");
        } else if (digit == 1) {
            System.out.println(yuan + " юань");
        } else if (digit >= 2 && digit <= 4) {
            System.out.println(yuan + " юаня");
        } else {
            System.out.println(yuan + " юаней");
        }
        System.out.println(roubles);
        scanner.close();
    }
}