import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Zadanie23 {
    public static void main(String[] args) throws IOException {
        Scanner skaner = new Scanner(System.in);
        System.out.println("podaj nazwe pliku");
        String nazwaPliku = skaner.nextLine();
        FileWriter strona = new FileWriter(nazwaPliku,true);
        PrintWriter wpisz = new PrintWriter(strona);
        System.out.println("Podaj imie i nazwisko");
        String imie = skaner.nextLine();
        System.out.println("Powiedz cos o sobie");
        String cos = skaner.nextLine();
        wpisz.println("<html>");
        wpisz.println("<head>");
        wpisz.println("</head>");
        wpisz.println("<body>");
        wpisz.println("<center>");
        wpisz.println("<h1>"+imie+"</h1>");
        wpisz.println("</center>");
        wpisz.println("<hr />\n");
        wpisz.println(cos);
        wpisz.println("<hr />");
        wpisz.println("</body>");
        wpisz.println("<html>");
 wpisz.close();

    }
}
