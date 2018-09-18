import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int wiek = 20;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wiek");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj imię");
        String name = scanner.nextLine();

        System.out.println("Witaj " + name);
        System.out.println("Masz " + age + " lat");

        System.out.println("Podaj liczbę zmiennoprzecinkową");
        double number = scanner.nextDouble();
        System.out.println("Twoja liczba to " + number);

    }
}
