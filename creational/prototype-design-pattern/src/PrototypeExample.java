public class PrototypeExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Circle redCircle = new Circle("Red");
        System.out.println(redCircle.hashCode());

        Circle anotherCircle = (Circle) redCircle.clone();
        System.out.println(anotherCircle.hashCode());
    }
}
