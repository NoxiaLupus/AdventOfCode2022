import exercises.dayOne;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        dayOne();
    }

    public static void dayOne() throws IOException {
        System.out.println(dayOne.countCalories("src/inputs/dayOne.txt", 1));
        System.out.println(dayOne.countCalories("src/inputs/dayOne.txt", 2));
    }
}
