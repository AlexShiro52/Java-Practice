import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double ROUBLES_PER_YUAN = 11.91;
        int yuan = scanner.nextInt();
        double roubles;
        roubles = ROUBLES_PER_YUAN * yuan;
        double down = Math.floor(roubles);
        System.out.println(down);
        scanner.close();
    }
}
