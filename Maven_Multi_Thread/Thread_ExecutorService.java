package example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExample {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.submit(() -> {
            numbers();
        });
        executorService.submit(() -> {
            numbers();
        });
        executorService.shutdown();         //bo inaczej program będzie ciągle włączony     //.shutdownNow - zamyka natychmiast, bez czekania na dokończenie wątków
    }

    private static void numbers() {
        for (int i = 0; i < 999; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
