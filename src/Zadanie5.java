import java.util.Scanner;
import java.lang.String;

public class Zadanie5 {
    public static void main(String[] args) {
        System.out.println("podaj ciag znakow");
        Scanner skaner=new Scanner(System.in);
       String ciag = skaner.nextLine();
        System.out.println("podaj znak ktorego wyszukujemy");
       char znak = skaner.nextLine().charAt(0);
      int suma=0;
       for(int i =0;i<ciag.length();i++)
       {
           if(ciag.charAt(i)==znak)
           {
            suma++;
           }
       }
        System.out.println("suma znaku: "+znak +" wynosi: "+suma);

    }
}
