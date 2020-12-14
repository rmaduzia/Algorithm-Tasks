import algorithms.adventOfCode.*;
import algorithms.spoj.green.PrimeGenerator;

import java.io.IOException;
import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args) throws IOException {
        System.out.println("Algorytmy");

        int AdventDay1Result = AdventDay1.getResultAdventDay1();
        int AdventDay2Part1Result = AdventDay2.getResultAdventDay2Part1();
        int AdventDay2Part2Result = AdventDay2.getResultAdventDay2Part2();
        int AdventDay3Part1Result = AdventDay3.getResultAdventDay3Part1(3, 1);
        long AdventDay3Part2Result = AdventDay3.getResultAdventDay3Part2();
        int AdventDay4ResultPart1 = AdventDay4.getResultAdventDay4Part1();
        int AdventDay4ResultPart2 = AdventDay4.getResultAdventDay4Part2();
        int AdventDay5ResultPart1 = AdventDay5.getResultAdventDay5Part1();
        int AdventDay6ResultPart1 = AdventDay6.getResultAdventDay6Part1();

        int AdventDay6ResultPart2 = AdventDay6.getResultAdventDay6Part2();

        System.out.println(AdventDay6ResultPart2);

        // System.out.println(PrimeGenerator.execute(1L,10L));


    }
}
