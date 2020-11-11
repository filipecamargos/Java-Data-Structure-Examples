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

        //Adding them to the singly linked list
        EmployeeSinglyLinkedList employeeList = new EmployeeSinglyLinkedList();

        employeeList.addToFront(jane);
        employeeList.addToFront(john);
        employeeList.addToFront(filipe);
        employeeList.addToFront(mara);

        System.out.println("Size: " + employeeList.getSize());
        System.out.println("Empty? " + employeeList.isEmpty());
        employeeList.printList();

        employeeList.removeFromFront();

        System.out.println("\nSize: " + employeeList.getSize());
        employeeList.printList();

        System.out.println("\n__________________________________________________\n" +
                "HERE IS THE NUMBER LINKED LIST");

        NumberSinglyList numberList = new NumberSinglyList();

        //Generate some random number for 100 times and add to list
        for(int i = 0; i < 100; i++){
            numberList.addNumber((int)(Math.random() * (100 - 0 + 1) + 0));
        }

        System.out.println(numberList.getSize());
        numberList.printListNumber();

        System.out.println("Empty: " + numberList.isEmpty());
        System.out.println(numberList.removeFrontNumber());
        numberList.printListNumber();

    }
}
