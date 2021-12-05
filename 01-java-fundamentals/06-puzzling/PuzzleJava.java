import java.util.Random;
import java.util.Arrays;
import java.net.PasswordAuthentication;
import java.sql.Array;
import java.util.ArrayList;

public class PuzzleJava{
//getTenRolls// Write a method that will generate and return an array with 10 random numbers between 1 and 20 inclusive. 
    public String getTenRolls(){
        int[] numbers = new int[10];
        Random rng = new Random();
        for(int i = 0; i < 10; i++){
            numbers[i] = 1+rng.nextInt(20);
        }
        String nums = Arrays.toString(numbers);
        return nums;
    }

    public Character getRandomLetter(){
        Random rng = new Random();
        ArrayList<Character> letters = new ArrayList<Character>();
        for(char i = 'A'; i <= 'Z'; i++){
            letters.add(i);
        }
        int x = rng.nextInt(26);
        char randomLett = letters.get(x);
        return randomLett;
    }

    public ArrayList<Object> generatePw(){
        Random rng = new Random();
        ArrayList<Object> str = new ArrayList<Object>();
        ArrayList<Character> letters = new ArrayList<Character>();
        for(char i = 'A'; i <= 'Z'; i++){
            letters.add(i);
        }
        for(int i = 1; i <= 8; i++){
            int index = rng.nextInt(26);
            char randomLett = letters.get(index);
            str.add(randomLett);
        }
        return str;
    }
    
    public ArrayList<Object> getNewPasswordSet(int length){
        ArrayList<Object> passwordSet = new ArrayList<Object>();
        ArrayList<Object> password = new ArrayList<Object>();
        for(int i = 1; i <= length; i++){
            password = generatePw();
            passwordSet.add(password);
        }
        return passwordSet;
    }

    
}

