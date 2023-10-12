import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int liczba = skaner.nextInt();
        int wynik=0;
        for(int i =1;i<liczba;i++){
            wynik=wynik+i;
        }
        System.out.println("Wynik"+ wynik );

    }
}
