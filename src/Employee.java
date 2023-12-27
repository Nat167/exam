import java.util.Objects;

public class Employee {

    private final int id;

    private String name;

    private String surname;

    private String patronymic;

    private int department;

    private double salary;

    private static int counter;



    public Employee(String name, String surname, String patronymic, int department, double salary) {
        if (department <= 0 || department > 5)
            throw new IllegalArgumentException("Введено невалидное значение department-допустимое значение от 1 до 5");
        counter++;
        this.id = getCounter();
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {

        if (department < 0 || department > 5) {
            throw new IllegalArgumentException("Введено невалидное значение");
        }
        this.department = department ;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }



    @Override
    public String toString() {
        return "Employee {" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }

    public String getFullName() {
        return name + " " + surname + " " + patronymic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
