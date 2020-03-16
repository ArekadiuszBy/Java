class Program{
    int value;
    String tekst;
     public Program() {
         this(5);
         System.out.println("1. konstruktor");
         value = 12;
         System.out.println("");
     }

     public Program(int value) {
         this(5,"xxxxx");
         this.value = value;
         System.out.println("2. konsturktor");
         System.out.println("  ");
     }

     public Program(int value, String text)
     {
         this.value=value;
         tekst=text;
         System.out.println("3. konsturktor");

     }
}

public class Constructors {
    public static void Funkcja1() {
        Program program = new Program();
        Program program1 = new Program(3);
        Program program2 = new Program(4,"bllblblb");
    }
}
