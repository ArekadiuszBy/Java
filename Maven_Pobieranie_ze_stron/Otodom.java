package getData;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class Otodom {
    public static void main(String[] args) throws Exception {
        URL otodom = new URL("https://www.otodom.pl/sprzedaz/mieszkanie/sopot/");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(otodom.openStream()));

        String inputLine;

        StringBuilder stringBuilder = new StringBuilder();      //StringBuffer jest wolniejszy, ale bezpieczniejszy na wielowątkowość

        while((inputLine = in.readLine()) != null){
            stringBuilder.append(inputLine);
            stringBuilder.append(System.lineSeparator());

        }
        in.close();

        //Nie list, a Set, bo set pozwala na przechowywanie unikalnych wartości, a linki na stronie mogą się powtarzać
        Set<String> linksList = new TreeSet<>() {
        };
        String content = stringBuilder.toString();

        //pętla - wyciągnięcie wszystkich linków, a nie tylko pierwszego
        for (int i = 0; i < content.length() ; i++) {
            i = content.indexOf("https://www.otodom.pl/pl/oferta/", i);         //indexOf("", i) - i, by nie zaczynał szukać znowu od początku (indeksu zerowego)
                                                                                    //i będzie stawało się od razu np. 1000, a nie będziemy zaczynali od 1, potem od 2 itd)

            if(i<0)
                break;                                                  //przerwanie pętli, bo inaczej gdy dojdziemy do końca strony to będziemy kazali poprzez pętle naszemu programowi dalej działać

            String substring = content.substring(i);                    //ucięcie kodu strony do wskazanego indeksu (zostaje tylko kod strony od wskazanego indeksu (linijki kodu))

                                                                        //Wycięcie tylko konkretnej linijki kodu strony (i to tylko części linijki do .html)
            String link = substring.split(".html")[0];            //split zwraca Tablice, zwrócenie pierwszej części
            linksList.add(link);
        }
        //1.
        System.out.println(linksList + "\n\n");

        //2.
        linksList.forEach(System.out::println);                         //by oferty wyświetlały się jedna pod drugą, a nie jedna obok drugiej
    }
}
