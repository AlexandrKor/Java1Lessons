package Lesson5;

public class Employee {
    private String fullName;
    private String post;
    private String email;
    private int phoneNumber;
    private int salary;
    private int age;


    public Employee(String fullName, String post, String email, int phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Сотрудник{" +
                "ФИО='" + fullName + '\'' +
                ", Должность='" + post + '\'' +
                ", email='" + email + '\'' +
                ", Номер телефона=" + phoneNumber +
                ", Зарплата=" + salary +
                ", возраст=" + age +
                '}';
    }

    public static void main(String[] args) {
        Employee[] person = new Employee[5];
        person[0] = new Employee("Артем", "Наладчик КИПиА", "артем@майл.рф", 892121212, 40000, 25);
        person[1] = new Employee("Станислав", "Инженер КИПиА", "стас@майл.рф", 8926675, 80000, 43);
        person[2] = new Employee("Павел", "Инженер механик", "павел@майл.рф", 892129098, 50000, 28);
        person[3] = new Employee("Алексей", "Инженер АСУТП", "алексей@майл.рф", 892178781, 90000, 50);
        person[4] = new Employee("Владимир", "Механик", "владимир@майл.рф", 892144444, 60000, 66);
        for (Employee persons : person) {
            if (persons.getAge() > 40) {
                persons.printInfo();
            }
        }
    }


}
