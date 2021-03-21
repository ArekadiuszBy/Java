import java.util.*;


interface Imetoda{
    void metoda();
        }

public class Main {

    static void fib(int n1, int n2,int count) {

        for (int i = 2; i < count; i++) {
            int n3;
            n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }
    }

    static int silnia(int liczba){
        int wynik;

        if(liczba <2){
            return 1;
        }
        else{
            return liczba * silnia(liczba-1);
        }

    }


    public static void main(String[] args){
        int n1=0,n2=1,n3,i,count=10;

        fib(n1,n2,count);

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        fib(n1,n2,x);

        System.out.print("\n" + silnia( 5));

        Lambda lambda = new Lambda();
        lambda.bookCab();
        lambda.lambdaMethod();

        List<String> lista = new ArrayList<String>();
        lista.add("c");
        lista.add("b");
        lista.add("a");

        Collections.sort(lista);

        for(String xx : lista)
            System.out.println(xx);

        List<Integer> listaInt = new LinkedList<Integer>();

        listaInt.add(321);
        listaInt.add(2);
        listaInt.get(1);

        Collections.sort(listaInt);

        for(Integer yy : listaInt){
            System.out.println(yy);
        }

        System.out.println();


        //FizzBuz

        for(int j=0;j<101;j++)
        {
            if(j%15==0)
                System.out.println("FizzBuzz");
            else if(j%5==0)
                System.out.println("Fizz");
            else if(j%3==0)
                System.out.println("Buzz");
            else
                System.out.println(j);

        }

    }
}
