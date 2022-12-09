package exercises;

import utilities.reader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class dayOne {

    public static int countCalories(String filename, int exNr) throws IOException {

        Integer[] calories = reader.readIntegers(filename);
        List<Integer> calculatedCalories = new ArrayList<>();
        int sum = 0, j = 0, result = 0, one, two, three;

        for (Integer calory : calories) {
            if (calory != null) {
                sum = sum + calory;
            } else {
                calculatedCalories.add(j, sum);
                sum = 0;
                j++;
            }
        }
        calculatedCalories.sort(null);
        if (exNr == 1) {
            result = calculatedCalories.get(calculatedCalories.size() - 1);
        } else if (exNr == 2) {
            one = calculatedCalories.get(calculatedCalories.size() - 1);
            two = calculatedCalories.get(calculatedCalories.size() - 2);
            three = calculatedCalories.get(calculatedCalories.size() - 3);
            result = one + two + three;
        }
        return result;
    }
}
