package com.coderscampus;

public class CustomListApplication {
    public static void main(String[] args) {
        CustomList<Integer> customList = new CustomArrayList<>();

        System.out.println("Hello!\nAdding elements to the Custom List...");
        for (int i = 0; i < 50; i++) {
            customList.add(i);
            System.out.println("Added element: " + i);
        }

        System.out.println("\nCustom List size after adding elements: "
                + customList.getSize() + "\n");

        System.out.println("Printing all elements in the Custom List...");
        for (int i = 0; i < customList.getSize(); i++) {
            System.out.println("Element at index " + i + " is: " +
                    customList.get(i));
        }


    }


}