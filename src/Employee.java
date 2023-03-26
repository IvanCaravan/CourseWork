
import java.util.Objects;

public class Employee {
    private String firstName;
    private String middleName;
    private String lastName;
    private int departmentNum;
    private int salary;
    private int id;
    private static int counter = 0;

    public Employee(String lastName, String firstName, String middleName, int departmentNum, int salary) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.departmentNum = departmentNum;
        this.salary = salary;
        this.id = counter++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return departmentNum == employee.departmentNum && salary == employee.salary && id == employee.id && Objects.equals(firstName, employee.firstName) && Objects.equals(middleName, employee.middleName) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, middleName, lastName, departmentNum, salary, id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", departmentNum=" + departmentNum +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }
    public String getLastName() {
        return this.lastName;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getMiddleName() {
        return this.middleName;
    }
    public int getDepartmentNum() {
        return this.departmentNum;
    }
    public int getSalary() {
        return this.salary;
    }
    public int getId() {
        return this.id;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void setDepartmentNum(int departmentNum) {
        this.departmentNum = departmentNum;
    }
    public String getFullName() {
        return (lastName + " " + firstName + " " + middleName);
    }
}

