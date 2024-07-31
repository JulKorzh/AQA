public class Person {
    public String fullName;
    public String position;
    public String email;
    public String phoneNumber;
    public int salary;
    public int age;
    public Person (String fullName, String position, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
    public void info() {
        System.out.println("fullName: " + fullName + "; position: " + position + "; email: " + email +
                "; phoneNumber: " + phoneNumber + "; salary: " + salary + "; age: " + age + ";");
    }
}
