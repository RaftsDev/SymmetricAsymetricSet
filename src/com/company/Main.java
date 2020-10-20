package com.company;

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

    }
}
