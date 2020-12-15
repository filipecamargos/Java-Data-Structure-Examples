package ferreira;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Example on the usage of HashTable
        Employee one = new Employee("Employee1", "LastName1", 1);
        Employee two = new Employee("Employee2", "LastName2", 2);
        Employee three = new Employee("Employee3", "LastName3", 3);
        Employee four = new Employee("Employee4", "LastName4", 4);
        Employee five = new Employee("Employee5", "LastName5", 5);

        //Create a Map
        Map<String, Employee> haspMapEmployee = new HashMap<String, Employee>();

        //Put the employess in the map with .put method
        haspMapEmployee.put("Employee1", one);
        haspMapEmployee.put("Employee2", two);
        haspMapEmployee.put("Employee3", three);
        haspMapEmployee.put("Employee4", four);
        haspMapEmployee.put("Employee5", five);

        //Create an Iterator<type> name= for what to print the values
        Iterator<Employee> iterator = haspMapEmployee.values().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //Check if contains the key and value methods
        System.out.println("Contain Key Employee1 = " + haspMapEmployee.containsKey("Employee1"));
        System.out.println("Contain Value  = " + haspMapEmployee.containsValue(one));

        //Put a value if it is absent if it already exist it will just return what is there while put overwrite the existing one
        haspMapEmployee.putIfAbsent("Employee3", three);

        //Get the value by using the key with constant time if it is not there you get back Null
        System.out.println("Get method = " + haspMapEmployee.get("Employee3"));

        //Set a default if the key is null on get method
        System.out.println("Get method default Two for none found = " + haspMapEmployee.getOrDefault("Null", two));

        //Remove method and return the item that has removed
        System.out.println("Remove item = " + haspMapEmployee.remove("Employee5"));

        //Print the key and value
        haspMapEmployee.forEach((k, v) -> System.out.println("Key = " + k + " Value = " + v));

    }
}
