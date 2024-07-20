package DSA;

import java.util.*;

public class collection_framework {

    public static void main(String[] args) {
        // Benefits of using Collection framework
        // 1. efficient data management
        // 2. Reusable Code
        // 3. Standardization
        // 4. Collections are used extensively in Java libraries and APIs

        // Where it is used
        // 1. Data Storage
        // 2. Algorithm Implementation: Many algorithms, like sorting and searching
        // 3. Frameworks and Libraries: Most Java frameworks (like Spring, Hibernate)
        // 4. Application Development

        // Overview of the Collections Framework
        //1. Collection: The root interface from which most collections derive.
        //2. List: Ordered collections that allow duplicate elements. (e.g., ArrayList, LinkedList)
        //3. Set: Collections that do not allow duplicate elements. (e.g., HashSet, TreeSet)
        //4. Queue: Collections used to hold multiple elements prior to processing. (e.g., LinkedList, PriorityQueue)
        //5. Map: Objects that map keys to values, without duplicate keys. (e.g., HashMap, TreeMap)


        //  L I S T
        // ArrayList example
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Alice");
        arrayList.add("Bob");
        arrayList.add("Ram");
        arrayList.remove(1);
        System.out.println("ArrayList: " + arrayList);

        // LinkedList example
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Charlie");
        linkedList.add("Dave");
        System.out.println("LinkedList: " + linkedList);


        // S E T
        // HashSet example
        //Note : here we cannot add redundant data
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        System.out.println("HashSet: " + hashSet);

        // TreeSet example
        //Note : here we cannot add redundant data
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Cherry");
        treeSet.add("Date");
        System.out.println("TreeSet: " + treeSet);

        // Q U E U E
        // Priority Queue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(30);
        priorityQueue.add(10);
        priorityQueue.add(20);

        System.out.println("PriorityQueue: " + priorityQueue);
        System.out.println("Poll: " + priorityQueue.poll()); // removes and returns the head of the queue
        System.out.println("PriorityQueue after poll: " + priorityQueue);

        // M A P
        // HashMap example
        // Note : It holds data with unique key
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2); // ("Key", Value) value can be the same but not key
        System.out.println("HashMap: " + hashMap);

        // TreeMap example
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Three", 3);
        treeMap.put("Four", 4);
        System.out.println("TreeMap: " + treeMap);

    }
}
