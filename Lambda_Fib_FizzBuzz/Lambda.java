interface Cab{
    void bookCab();
}

public class Lambda implements Cab{
    public void lambdaMethod(){

        Cab cab = new Cab(){
            public void bookCab(){
                System.out.print("\n UberX Booked");
            }
        };
        cab.bookCab();

        Cab cab1 = () -> {
            System.out.print("\n Lambda \n");
        };
        cab1.bookCab();
    }

    @Override
    public void bookCab() {
        System.out.println();
        System.out.println("Hello BookCab");
    }
}
