import algorithms.adventOfCode.AdventDay1;
import algorithms.adventOfCode.AdventDay2;
import algorithms.adventOfCode.AdventDay3;
import algorithms.adventOfCode.AdventDay4;

import java.io.IOException;

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
        System.out.println(AdventDay4ResultPart2);


    }
}
