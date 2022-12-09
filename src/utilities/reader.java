package utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class reader {

    public static String[] readLines(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<String> lines = new ArrayList<>();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            lines.add(line);
        }
        bufferedReader.close();
        return lines.toArray(new String[0]);
    }

    public static Integer[] readIntegers(String filename) throws IOException {
        String[] stringArray = readLines(filename);
        List<Integer> numberArray = new ArrayList<>();
        for (String s : stringArray) {
            if (s.isBlank()) {
                numberArray.add(null);
            } else {
                numberArray.add(Integer.parseInt(s));
            }
        }
        return numberArray.toArray(new Integer[0]);
    }

}
