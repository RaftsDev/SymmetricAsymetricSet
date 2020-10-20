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

        System.out.println("Square size: " + squares.size() + " cubes size: " + cubes.size());

    }
}
