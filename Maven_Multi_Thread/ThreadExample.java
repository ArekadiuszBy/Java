package example;

public class ThreadExample {
    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 999; i++) {
                    System.out.println(Thread.currentThread().getName() + " " +i);
                }
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 1; i < 999; i++) {
                System.out.println(Thread.currentThread().getName() + " " +i);
            }
        });

        Thread t3 = new Thread(new Thread(){
            public void run() {
                for (int i = 1; i < 999; i++) {
                    System.out.println(Thread.currentThread().getName() + " " +i);
                }
        }});


        t1.setName("t1");
        t2.setName("t2");
        t3.setName("Thread");

        t1.setPriority(1);      //przydział od 1-10
        t2.setPriority(5);
//        t1.run();           //uruchamia metodę w wątku głównym aplikacji
        t1.start();         //uruchamia metodę w OSOBNYM wątku aplikacji
        t2.start();

        t3.start();

    }
}
