import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner skaner=new Scanner(System.in);
        System.out.println("podaj liczbe dni");
       long dni = skaner.nextInt();
        long iloscGroszy=1;
        for (int i=1;i<=dni;i++)
        {
            iloscGroszy = iloscGroszy*2;
        }
       double złotowki = iloscGroszy/100;
        System.out.println("ilosc groszy: "+iloscGroszy);
        System.out.println("ilosc złotych: "+złotowki);
    }
}
