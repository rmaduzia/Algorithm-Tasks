package algorithms.adventOfCode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class AdventDay6 {

    public static int getResultAdventDay6Part1() throws IOException {

        List<String> dateFromFiles = Files.readAllLines(Paths.get("src/main/resources/inputs/adventOfCodeDay6.txt"));
        StringBuilder builder = new StringBuilder();
        int counter = 0;

        Iterator<String> iterator = dateFromFiles.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (!iterator.hasNext()) {
                counter += builder.toString().chars().distinct().count();
                builder.setLength(0);
            }
            if (!name.equals("")) {
                builder.append(name);
            }
            else {
                counter += builder.toString().chars().distinct().count();
                builder.setLength(0);
            }
        }

        return counter;

    }


    //TODO RECONFIGURE CODE
    public static int getResultAdventDay6Part2() throws IOException {

        List<String> dateFromFiles = Files.readAllLines(Paths.get("src/main/resources/inputs/adventOfCodeDay6.txt"));
        StringBuilder builder = new StringBuilder();
        List<String> groups = new ArrayList<>();
        int counter = 0;

        for (int i=0; i<dateFromFiles.size(); i++) {
            if(!dateFromFiles.get(i).equals("")){
                builder.append(dateFromFiles.get(i)).append(";");
            }
            else{
                builder.setLength(builder.length()-1);
                groups.add(builder.toString());
                builder.setLength(0);
            }

            if (i == dateFromFiles.size()-1){
                builder.setLength(builder.length()-1);
                groups.add(builder.toString());
                builder.setLength(0);
            }
        }
        Set<Character> charSet = new LinkedHashSet<>();
        char[] charsTemp;
        char[] charsRestAdder;
        for (String s: groups) {
            String firstString =  s.split(";")[0];
            charsTemp = firstString.toCharArray();
            for (char c: charsTemp) {
                charSet.add(c);
            }
            for (int i=0; i < s.chars().filter(ch -> ch ==';').count()+1; i++) {
                String part =  s.split(";")[i];

                charsRestAdder = part.toCharArray();
                for (char c: charsRestAdder) {
                    if (charSet.contains(c)) {
                        counter += +1;
                    } else {
                        charSet.add(c);
                    }
                }
            }
            charSet.clear();
        }
        return counter;
    }
}