package ferreira;

public class EmployeeNode {
    /**
     * A employee node class that will be used in out Singly Linked List for Employees
     */
    private Employee employee;
    private EmployeeNode next;

    public EmployeeNode (Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    public String toString() {
        return employee.toString();
    }
}
