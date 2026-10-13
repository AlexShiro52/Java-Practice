package pr4.t5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] months = {"январь", "февраль", "март", "апрель", "май", "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            try {
                if (number == 2) {
                    int year = scanner.nextInt();
                    if (ves(year) == true) {
                        days[1] = 29;
                    }
                }
                System.out.println(months[number - 1] + '\n' + days[number - 1]);
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Номер месяца должен быть от 1 до 12");
            }
        } else {
            System.out.println("некорректное число");
        }
        scanner.close();
    }
    public static boolean ves(int year) {
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            return true;
        }
        else {
            return false;
        }
    }
}
