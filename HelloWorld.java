import java.util.Scanner;

class Hi{
void tenteges(int o) {
    System.out.println(o);
}}


public class HelloWorld extends Main{
    public static void podstawy()
    {
        System.out.println("ELO world");
        boolean bool = 1>2;
        boolean bool1 = 2>1;
        System.out.println(bool + " 1>2 | 2>1 " + bool1 );


        //INPUT
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tekst (a/b/c)");
        String text = scanner.nextLine();
        System.out.println(text);
        double x = 1.2;
        int a = (int)x;
        System.out.println(x + " " + a);
        System.out.println();
        System.out.println("SWITCH:");
        switch(text)
        {
            case "a":
                System.out.println("aaaaaaa");
                break;
            case "b":
                System.out.println("bbbbbb");
                break;
            case "c":
                System.out.println("cccccc");
                break;
            default:
                System.out.println("YOU");
                break;
        }

        System.out.println();
        System.out.println("TAB:");

        int[] tab = new int[5];
        for(int i=0;i<5;i++)
        {
            tab[i]=i;
        }
        for(int i=0;i<5;i++)
        {
            System.out.println(tab[i]);
        }

        System.out.println("MULTITAB:");
        int[][] multitab = {{5,6,7,8,9},{11,22,33,44,55}};

        for(int i=0;i<2;i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(multitab[i][j]);
            }
            System.out.println();
        }

        double[][] doubletab = new double[1][2];

        System.out.println();
        System.out.println("TENTEGES");
        Hi hello = new Hi();
        hello.tenteges(2);
    }
}
