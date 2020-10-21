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
    }
}
