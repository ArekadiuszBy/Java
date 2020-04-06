public class lekcja{
    public static void main(String ... args)
    {
        lekcja x = new lekcja();
        x.View();
        x.metoda("xxxxx", 2);
        x.metoda(1,2);
        System.out.println(x.metoda(5));

    }

    public void View()
    {
        System.out.println("X");
    }

    public void metoda(String str, int x)
    {
        System.out.println("Podaj str" + str + "     Podaj liczbe" + x);
    }

    public void metoda(int a, int b)
    {
        System.out.println("Sumuj dwie liczby: " + a + b);
    }

    public int metoda(int a){
        a*=a;
        return a;
    }
}