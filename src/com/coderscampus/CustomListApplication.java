package com.coderscampus;

public class CustomListApplication {
    public static void main(String[] args) {
        CustomList<Integer> customList = new CustomArrayList<>();

        for (int i = 0; i < 50; i++) {
            customList.add(i);
        }

        System.out.println("List size is: " + customList.getSize());

        for (int i = 0; i < customList.getSize(); i++) {
            System.out.println("Element at index " + i + " is: " +
                    customList.get(i));
        }


    }


}