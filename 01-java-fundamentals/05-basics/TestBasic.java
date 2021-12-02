import java.util.ArrayList;

public class TestBasic {
    public static void main(String[] args) {
        BasicJava loop = new BasicJava();

        loop.print255();

        loop.printOdd255();

        int testSum255 = loop.sum255();
        System.out.println(testSum255);

        loop.iterArr();

        int[] myArray = {-5,-2,-100,-4,-1};
        int maxNum = loop.findMax(myArray);
        System.out.println(maxNum);

        ArrayList<Integer> testoddArr = loop.oddArray();
        System.out.println(testoddArr);
    
    }
}
