package ferreira;

import java.util.Objects;

public class Employee {
    /**
     * Just a simple employee Class with field such as name lastname and id
     */
    private String fistName;
    private String lasName;
    private int id;

    public Employee(String fistName, String lasName, int id) {
        this.fistName = fistName;
        this.lasName = lasName;
        this.id = id;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLasName() {
        return lasName;
    }

    public void setLasName(String lasName) {
        this.lasName = lasName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                Objects.equals(fistName, employee.fistName) &&
                Objects.equals(lasName, employee.lasName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fistName, lasName, id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fistName='" + fistName + '\'' +
                ", lasName='" + lasName + '\'' +
                ", id=" + id +
                '}';
    }
}
