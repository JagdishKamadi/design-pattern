
public class Main {
    public static void main(String[] args) {

        Student student1 = StudentBuilder.builder()
                .firstName("Jagdish")
                .lastName("Kamadi")
                .age(21)
                .phoneNumber("1234567890")
                .email("jagdish@example.com")
                .build();

        System.out.println(student1);

        Student student2 = StudentBuilder.builder()
                .firstName("Jagdish")
                .lastName("Kamadi")
                .email("jagdish@example.com")
                .build();

        System.out.println(student2);

    }
}