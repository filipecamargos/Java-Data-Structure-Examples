package ferreira;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        //Creating some employees
        Employee jane = new Employee("Jane", "Jones", 123);
        Employee john = new Employee("John", "Though", 356);
        Employee filipe = new Employee("Filipe", "Court", 5966);
        Employee mara = new Employee("Mara", "Dera", 365);
        Employee jimy = new Employee("Jimmy", "Johns", 365);

        //Create a list and add some employees
        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
        list.addToFront(jane);
        list.addToFront(john);
        list.addToFront(filipe);
        list.addToFront(mara);

        System.out.println("Size: " + list.getSize());
        list.printList();

        //Add a new one to the end
        list.addToEnd(jimy);
        System.out.println("\nSize: " + list.getSize());
        list.printList();

        //Remove one from the front
        list.removeFromFront();
        System.out.println("\nSize: " + list.getSize());
        list.printList();

        //Remove one from the end
        list.removeFromEnd();
        System.out.println("\nSize: " + list.getSize());
        list.printList();

    }
}
