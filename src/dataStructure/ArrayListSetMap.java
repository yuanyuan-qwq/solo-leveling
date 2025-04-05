package dataStructure;

import java.util.*;

public class ArrayListSetMap {
    public void array(){
        // 1. Declare and initialize an array
        int[] numbers = {10, 20, 30, 40, 50};

        // 2. Access elements by index
        System.out.println("First element: " + numbers[0]); // Output: 10

        // 3. Modify an element
        numbers[2] = 35;
        System.out.println("Modified third element: " + numbers[2]); // Output: 35

        // 4. Get the size of the array
        System.out.println("Length of array: " + numbers.length); // Output: 5

        // 5. Loop through the array using for loop
        System.out.print("Elements using for loop: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // 6. Loop using enhanced for-loop (foreach)
        System.out.print("Elements using foreach loop: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 7. Declare and initialize a String array
        String[] fruits = new String[3];
        fruits[0] = "Apple";
        fruits[1] = "Banana";
        fruits[2] = "Cherry";

        System.out.print("Fruits: ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();
    }

    public void list() {
        // 1. Create an ArrayList of Strings
        ArrayList<String> cities = new ArrayList<>();

        // 2. Add elements to the list
        cities.add("New York");
        cities.add("London");
        cities.add("Tokyo");

        // 3. Access elements by index
        System.out.println("First city: " + cities.get(0)); // Output: New York

        // 4. Modify an element
        cities.set(1, "Paris");
        System.out.println("Modified second city: " + cities.get(1)); // Output: Paris

        // 5. Get the size of the list
        System.out.println("Size of the list: " + cities.size()); // Output: 3

        // 6. Remove an element
        cities.remove("Tokyo");

        // 7. Loop through the list
        System.out.print("Cities: ");
        for (String city : cities) {
            System.out.print(city + " ");
        }
        System.out.println();

        // 8. Check if list contains an element
        System.out.println("Contains New York? " + cities.contains("New York")); // true
    }

    public void set() {
        // 1. Create a HashSet of Strings
        Set<String> names = new HashSet<>();

        // 2. Add elements
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Alice"); // Duplicate — will be ignored

        // 3. Display the set
        System.out.print("Names in the set: ");
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();

        // 4. Check size
        System.out.println("Size of set: " + names.size()); // Duplicates not counted

        // 5. Check if an element exists
        System.out.println("Contains Bob? " + names.contains("Bob")); // true

        // 6. Remove an element
        names.remove("Charlie");
        System.out.println("After removing Charlie: " + names);
    }

    public void map() {
        // 1. Create a HashMap
        Map<String, Integer> ages = new HashMap<>();

        // 2. Add key-value pairs
        ages.put("Alice", 25);
        ages.put("Bob", 30);
        ages.put("Charlie", 28);

        // 3. Access a value by key
        System.out.println("Alice's age: " + ages.get("Alice")); // Output: 25

        // 4. Modify a value
        ages.put("Bob", 31); // Updates Bob's age

        // 5. Check if a key exists
        System.out.println("Contains Charlie? " + ages.containsKey("Charlie")); // true

        // 6. Remove a key-value pair
        ages.remove("Alice");

        // 7. Loop through entries
        System.out.println("All entries in map:");
        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // 8. Get keys and values
        System.out.println("All keys: " + ages.keySet());
        System.out.println("All values: " + ages.values());
    }

    public void mapOfLists() {
        Map<String, List<String>> departmentEmployees = new HashMap<>();

        // Add Engineering department
        List<String> engineering = new ArrayList<>();
        engineering.add("Alice");
        engineering.add("Bob");
        departmentEmployees.put("Engineering", engineering);

        // Add Marketing department
        List<String> marketing = new ArrayList<>();
        marketing.add("Charlie");
        marketing.add("Diana");
        departmentEmployees.put("Marketing", marketing);

        // Iterate and print
        for (Map.Entry<String, List<String>> entry : departmentEmployees.entrySet()) {
            System.out.println(entry.getKey() + " Department: " + entry.getValue());
        }
    }

    public void mapOfMaps() {
        Map<String, Map<String, Integer>> studentGrades = new HashMap<>();

        // Student 1 grades
        Map<String, Integer> gradesAlice = new HashMap<>();
        gradesAlice.put("Math", 90);
        gradesAlice.put("Science", 85);
        studentGrades.put("Alice", gradesAlice);

        // Student 2 grades
        Map<String, Integer> gradesBob = new HashMap<>();
        gradesBob.put("Math", 75);
        gradesBob.put("Science", 80);
        studentGrades.put("Bob", gradesBob);

        // Update existing value: Change Alice's Math grade from 90 to 95
        if (studentGrades.containsKey("Alice") && studentGrades.get("Alice").containsKey("Math")) {
            studentGrades.get("Alice").put("Math", 95);
        }

        // Iterate and print
        for (Map.Entry<String, Map<String, Integer>> studentEntry : studentGrades.entrySet()) {
            System.out.println("Student: " + studentEntry.getKey());
            for (Map.Entry<String, Integer> subjectEntry : studentEntry.getValue().entrySet()) {
                System.out.println("  " + subjectEntry.getKey() + ": " + subjectEntry.getValue());
            }
        }

    }

    public void treeMap() {
        // Create a TreeMap
        TreeMap<String, Integer> scores = new TreeMap<>();

        // Add entries
        scores.put("Charlie", 70);
        scores.put("Alice", 90);
        scores.put("Bob", 85);

        // TreeMap automatically sorts by key (alphabetically)
        System.out.println("Sorted scores:");
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // Access first and last keys
        System.out.println("First key: " + scores.firstKey());
        System.out.println("Last key: " + scores.lastKey());

        // Find next higher or lower keys
        System.out.println("Key higher than 'Alice': " + scores.higherKey("Alice"));
        System.out.println("Key lower than 'Charlie': " + scores.lowerKey("Charlie"));
    }



    //--------------------------------------------------------------------------------------------------------------------
    public void CLI() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("\n--- Data Structure Demo CLI ---");
            System.out.println("1. Array");
            System.out.println("2. List");
            System.out.println("3. Set");
            System.out.println("4. Map");
            System.out.println("5. Map of Lists");
            System.out.println("6. Map of Maps");
            System.out.println("7. Tree Maps");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> array();
                case 2 -> list();
                case 3 -> set();
                case 4 -> map();
                case 5 -> mapOfLists();
                case 6 -> mapOfMaps();
                case 7 -> treeMap();
                case 0 -> {
                    System.out.println("Exiting.... Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

}
