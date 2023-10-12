import java.util.Random;
import java.util.Scanner;

public class Zadanie19 {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        Random rng = new Random();
        int wybor=0;
        int punkty=0;
        for(int i=0;i<10;i++) {
            int liczbalosowa = rng.nextInt(5);
            System.out.println("podaj kolor czerwony - 1 zielony - 2 niebieski -3 pomaranczowy - 4 zolty - 5");
            wybor= skaner.nextInt();
            if (wybor==liczbalosowa)
            {
                punkty++;
            }
            if(liczbalosowa==1)
            {
                System.out.println("czerwony");
            }
            if(liczbalosowa==2)
            {
                System.out.println("zielony");
            }
            if(liczbalosowa==3)
            {
                System.out.println("niebieski");
            }
            if(liczbalosowa==4)
            {
                System.out.println("pomaranczowy");
            }
            if(liczbalosowa==5)
            {
                System.out.println("zolty");
            }
        }
        System.out.println("Liczba poprawnych odpowiedzi: " +punkty);
    }
}
