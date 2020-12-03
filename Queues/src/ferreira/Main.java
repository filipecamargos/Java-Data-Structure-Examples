package ferreira;

import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        Employee juca = new Employee("Juca", "Bro", 123);
        Employee bulla = new Employee("Bulla", "Suan", 4567);
        Employee maker = new Employee("Maker", "Teick", 22);
        Employee walker = new Employee("Walker", "Bloga", 3245);

        ArrayQueue queue = new ArrayQueue(10);

        queue.add(juca);
        queue.add(maker);
        queue.add(bulla);
        queue.add(walker);

        System.out.println("The First One" + queue.peek() + "\nThe whole Queue");
        queue.printQueue();
        queue.remove();
        System.out.println("One was removed, now the size is: " + queue.size());
    }
}
