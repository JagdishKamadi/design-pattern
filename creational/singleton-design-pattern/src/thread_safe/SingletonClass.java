package thread_safe;

public class SingletonClass {
    private static SingletonClass instance;

    private SingletonClass() {

    }

    public static synchronized SingletonClass getInstance() {
        if (instance == null) {
            try {
                Thread.sleep(1000);
                instance = new SingletonClass();
            } catch (InterruptedException e) {
                System.out.println(e.getCause());
            }
        }
        return instance;
    }
}
