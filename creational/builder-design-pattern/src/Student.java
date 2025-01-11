
public class Student {
    private String firstName;
    private String lastName;
    private Integer age;
    private String phoneNumber;
    private String email;

    public Student(StudentBuilder studentBuilder) {
        this.firstName = studentBuilder.getFirstName();
        this.lastName = studentBuilder.getLastName();
        this.age = studentBuilder.getAge();
        this.phoneNumber = studentBuilder.getPhoneNumber();
        this.email = studentBuilder.getEmail();
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
