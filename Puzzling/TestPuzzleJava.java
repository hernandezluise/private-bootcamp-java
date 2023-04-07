import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class TestPuzzleJava {
    public static void main(String[] args) {
        PuzzleJava generator = new PuzzleJava();
        ArrayList<Integer> randomRolls = generator.getTenRolls();
        System.out.println(randomRolls);

        String randomLetter = generator.getRandomLetter();
        System.out.println(randomLetter);

        String randomPassword = generator.generatrePassword();
        System.out.println(randomPassword);

        //String randomPasswordSet = generator.getNewPasswordSet(9);
        System.out.println(generator.getNewPasswordSet(20));
    }

}
