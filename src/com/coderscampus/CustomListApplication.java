package com.coderscampus;

public class CustomListApplication {
    public static void main(String[] args) {
        CustomList<Integer> customList = new CustomArrayList<>();
        // Add elements to customList and check its size.
        for (int i = 0; i < 20; i++) {
            customList.add(i);
        }

         System.out.println("List size is: " + customList.getSize());
        // List size is: 20

        // Get elements from customList and print them.
        for (int i = 0; i < customList.getSize(); i++) {
             System.out.println("Element at index " + i + " is: " + customList.get(i));
        }

    }
}