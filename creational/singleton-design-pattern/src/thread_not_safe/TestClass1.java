package thread_not_safe;


public class TestClass1 {
    public static void main(String[] args) {

        // Single thread example
        SingletonClass singletonClass1 = SingletonClass.getInstance();
        SingletonClass singletonClass2 = SingletonClass.getInstance();

        // you will get the same hashcode as we are running on program only using on thread
        System.out.println(singletonClass1.hashCode());
        System.out.println(singletonClass2.hashCode());

    }
}