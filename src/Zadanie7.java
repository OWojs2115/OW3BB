import java.util.ArrayList;
import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        System.out.println("podaj liczbe pieter");
        int lpieter = skaner.nextInt();
       int [] zajete = new int[lpieter];
       int [] wszystkie = new int[lpieter];
        int sumaZajetych=0;
        int sumaWszystkich=0;
       for(int i=0;i<lpieter;i++)
       {
           System.out.println("podaj liczbe wszystkich pokoi");
           wszystkie[i]=skaner.nextInt();
           System.out.println("Podaj liczbe zajetych pokoi");
           zajete[i]=skaner.nextInt();
           sumaZajetych=sumaZajetych+zajete[i];
           sumaWszystkich=sumaWszystkich+wszystkie[i];
       }

        System.out.println("Wszytskie pokoje: " +sumaWszystkich+ " Suma zajetych: "+ sumaZajetych);
    }
}
