public class Employee {

    private final int id;

    private static int counter;

    private String surname;

    private String name;

    private String middleName;

    private int department;

    private double salary;



    public Employee(String surname, String name, String middleName, int department, double salary) {
        if (department <= 0 || department > 5) throw new IllegalArgumentException("Ошибка. Такого отдела нет.");
        counter++;
        this.id = getCounter();
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public static int getCounter() {
        return counter;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        if (department >= 1 && department <= 5) {
            department++;
        }
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }

    public String getFullName() {
        return "Employee{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                '}';
    }

    public String getFullNameDepartment() {
        return "Employee{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", salary=" + salary +
                '}';
    }
}

