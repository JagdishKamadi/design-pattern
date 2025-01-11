package thread_not_safe;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class TestClass2 {
    public static void main(String[] args) {
        // multi thread example, which is not safe
        System.out.println("Using Multithreading");
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        IntStream.range(0, 10)
                .forEach(i -> {
                    executorService.submit(() -> {
                        try {
                            Thread.sleep(100);
                            System.out.println(SingletonClass.getInstance().hashCode());
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                    });
                });
        executorService.shutdown();
    }
}
