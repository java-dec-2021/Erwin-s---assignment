import java.util.ArrayList;
import java.util.Random;

public class TestPuzzle {
    public static void main(String[] args) {
        PuzzleJava malafu = new PuzzleJava();

        System.out.println(malafu.getTenRolls());

        System.out.println(malafu.getRandomLetter());

        System.out.println(malafu.generatePw());

        System.out.println(malafu.getNewPasswordSet(4));
    }
}
