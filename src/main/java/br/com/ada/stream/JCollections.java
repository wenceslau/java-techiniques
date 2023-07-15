package br.com.ada.stream;

import java.util.*;

public class JCollections {
    public static void main(String[] args) {

        // ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("C++");
        System.out.println("ArrayList: " + arrayList);

        // LinkedList
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        System.out.println("LinkedList: " + linkedList);

        // HashSet
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        System.out.println("HashSet: " + hashSet);

        // TreeSet
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(8);
        System.out.println("TreeSet: " + treeSet);

        // LinkedHashSet
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Red");
        linkedHashSet.add("Green");
        linkedHashSet.add("Blue");
        System.out.println("LinkedHashSet: " + linkedHashSet);

        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("John", 25);
        hashMap.put("Emily", 30);
        hashMap.put("Mike", 35);
        System.out.println("HashMap: " + hashMap);

        // TreeMap
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Apple", 10);
        treeMap.put("Banana", 20);
        treeMap.put("Orange", 30);
        System.out.println("TreeMap: " + treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("January", 1);
        linkedHashMap.put("February", 2);
        linkedHashMap.put("March", 3);
        System.out.println("LinkedHashMap: " + linkedHashMap);

        // PriorityQueue
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(1);
        priorityQueue.offer(2);
        priorityQueue.offer(8);
        System.out.println("PriorityQueue: " + priorityQueue);

        // Stack
        Stack<String> stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println("Stack: " + stack);

        UUID uuid = UUID.randomUUID();



    }
}
