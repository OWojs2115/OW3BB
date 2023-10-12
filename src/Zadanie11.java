import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        System.out.println("podaj temperature w celsjuszach");
        int temperatura = skaner.nextInt();
        double fahrenheit=(temperatura*1.800)+32;
        System.out.println("temperatura w fahrenhaitach: " + fahrenheit);
    }
}
