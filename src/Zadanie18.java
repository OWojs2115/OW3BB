import java.util.Random;
import java.util.Scanner;

public class Zadanie18 {
    public static void main(String[] args) {
        Random rng = new Random();
        Scanner skaner = new Scanner(System.in);
        int wybrana = 0;
        int licznik=0;
        int losowaliczba= rng.nextInt(100);
        do {
            licznik++;
            System.out.println("sprobuj odgadnac liczbe 0-100");
            wybrana = skaner.nextInt();
            if(wybrana<losowaliczba)
            {
                System.out.println("liczba jest za mala");
            }
            else if(wybrana>losowaliczba)
            {
                System.out.println("liczba jest za duza");
            }
        }while(wybrana != losowaliczba);
        if(wybrana==losowaliczba)
        {
            System.out.println("Odgadles liczbe!!!");
            System.out.println("Liczba prob: "+licznik);
        }
    }
}

