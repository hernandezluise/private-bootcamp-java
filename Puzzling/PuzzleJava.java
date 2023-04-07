import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {
    public ArrayList<Integer> getTenRolls() {

        ArrayList<Integer> random10 = new ArrayList<Integer>();

        Random randomNumber = new Random();

        for ( int i = 1; i <=10; i++ ) {
            random10.add(randomNumber.nextInt(20) + 1);

        }
        return random10;
    }

    public  String getRandomLetter() {
        Random randomAlphabetLetter = new Random();

        String alphabetLetters = "abcdefghijklmnopqrstuvwxyz";
        String[] letters = new String[26];


        for (int i = 0; i < 26; i++ ) {
            letters[i] = String.valueOf(alphabetLetters.charAt(i));
        }
        return letters[randomAlphabetLetter.nextInt(26)];
    }

    public String generatrePassword() {
        String password = "";
        for (int i = 0; i  < 8; i++) {
            password = password + getRandomLetter();
        }
        return password;
    }

    public ArrayList<String> getNewPasswordSet(int length) {
        ArrayList<String> passwordSet = new ArrayList<String>();
        for (int i = 0; i < length; i++){
            passwordSet.add(generatrePassword());
        }
        return passwordSet;
    }

}


