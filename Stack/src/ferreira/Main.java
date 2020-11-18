package ferreira;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack(10);

        stack.push(new Employee("Jack", "Moon", 596));
        stack.push(new Employee("Zack", "Doom", 956));
        stack.push(new Employee("Jane", "Lizz", 568));
        stack.push(new Employee("Mary", "Klou", 695));

        stack.printStack();
        System.out.println("\n" + stack.pick());

        stack.pop();
        System.out.println("Size: " + stack.size());
        stack.printStack();
    }
}
