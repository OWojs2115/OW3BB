import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        System.out.println("podaj ilosc liczb");
        int ilosc = skaner.nextInt();
        int [] tablica = new int[ilosc+1];
        int wieksza=0;
        int mniejsza=0;
        for(int i = 0;i<ilosc;i++)
        {
            System.out.println("Podaj liczbe");
            tablica[i]=skaner.nextInt();
            if(tablica[i]>tablica[i+1])
            {
                wieksza=tablica[i];
                mniejsza=tablica[i+1];
            }
            else if(tablica[i]<tablica[i+1])
            {
                wieksza=tablica[i+1];
                mniejsza=tablica[i];
            }

        }
        System.out.println("Najwieksza liczbna: "+wieksza);
        System.out.println("Najmniejsza liczba: "+ mniejsza);
    }
}
