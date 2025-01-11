package thread_safe;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class TestClass {
    public static void main(String[] args) {
        // multi thread example, which is not safe
        System.out.println("Using Multithreading");
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        IntStream.range(0, 9)
                .forEach(i -> {
                    executorService.submit(() -> {
                        System.out.println(SingletonClass.getInstance().hashCode());
                    });
                });
        executorService.shutdown();
    }
}
