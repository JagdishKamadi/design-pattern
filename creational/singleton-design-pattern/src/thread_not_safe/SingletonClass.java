package thread_not_safe;

public class SingletonClass {
    private static SingletonClass instance;

    private SingletonClass() {

    }

    public static SingletonClass getInstance() {
        try {
            Thread.sleep(100);
            instance = new SingletonClass();
        } catch (InterruptedException e) {
            System.out.println(e.getCause());
        }
        return instance;
    }
}
