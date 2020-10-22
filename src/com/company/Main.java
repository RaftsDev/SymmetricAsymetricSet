package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for(int i=1; i<=100; i++){
            squares.add(i * i);
            cubes.add(i * i * i);
        }
        System.out.println("Square size: " + squares.size() + " and cubes size: " + cubes.size());

        //Create a union

        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);
        System.out.println("Union size: " + union.size());

        //Create Intersection

        System.out.println("-------------------------------------");
        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println("intersection has size: " + intersection.size());
        for(int i : intersection){
            System.out.println(i + " is square of " + Math.sqrt(i) + " and cubes of " + Math.cbrt(i));
        }

        // Populate Set from Array

        Set<String> words = new HashSet<>();
        String sentence = "one day in the year of the fox";
        String[] arrayWords = sentence.split(" ");
        words.addAll(Arrays.asList(arrayWords));

        for(String s : words){
            System.out.println(s);
        }

        //Symetric  and Asymetric operation

        System.out.println("---------------------------------------");
        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();

        String[] natureWords = {"all", "nature", "is", "but", "art", "unknown", "to", "thee"};
        nature.addAll(Arrays.asList(natureWords));

        String[] divineWords = {"to", "err", "is", "human", "to", "forgive", "divine"};
        divine.addAll(Arrays.asList(divineWords));

        System.out.println("nature-divine:");
        Set<String> diff1 = new HashSet<>(nature);
        diff1.removeAll(divine);
        printSet(diff1);

        System.out.println("divine-nature:");
        Set<String> diff2 = new HashSet<>(divine);
        diff2.removeAll(nature);
        printSet(diff2);

        Set<String> unionTest = new HashSet<>(nature);
        unionTest.addAll(divine); // Create whole unoin

        Set<String> interSectionTest = new HashSet<>(nature);
        interSectionTest.retainAll(divine);// Get intersection

        System.out.println("-----------------------------------");
        System.out.println("Symmetric difference:");
        unionTest.removeAll(interSectionTest); // Get Symmetric difference
        printSet(unionTest);

        //Set contains other Set

        System.out.println(" ----------------  Subsets --------------------");

        if(nature.containsAll(divine)){
            System.out.println("divine is a subset of nature");
        }

        if(nature.containsAll(interSectionTest)){
            System.out.println("intersection is a subset of nature");
        }

        if(divine.containsAll(interSectionTest)){
            System.out.println("intersection is a subset of divine");
        }

    }
    private static void printSet(Set<String> set){
        System.out.print("\t");
        for(String s : set){
            System.out.print(s + " ");
        }
        System.out.println("");
    }
}
