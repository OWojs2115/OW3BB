import java.util.Scanner;

public class Zadanie16 {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        System.out.println("podaj swoj miesieczny budzet");
        int budzet = skaner.nextInt();
        System.out.println("podaj ilosc wydatkow");
        int iloscWydatkow = skaner.nextInt();
        int reszta=budzet;
        int licznik=1;
        for(int i =0;i<iloscWydatkow;i++)
        {

            System.out.println("Podaj kwote wydatku: " +licznik);
            int wydatek=skaner.nextInt();
            reszta=reszta-wydatek;
            licznik++;
        }
        System.out.println("Reszta pieniedzy po oplatach to: "+reszta+" zł" );
    }
}
