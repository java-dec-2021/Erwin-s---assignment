import java.util.ArrayList;
public class BasicJava {
    public void print255(){
        int e = 1;
        while(e <= 255) {
            System.out.println(e);
            e++;
        }
    }

    public void printOdd255(){
        int e = 1;
        while(e <= 255) {
            if (e % 2 == 1 ){
                System.out.println(e);
            }
            e++;
        }
    }
    
    public int sum255(){
        int sum = 0;
        for(int s = 1; s <= 255; s++){
            sum = sum + s;
        }
        return sum;
    }

    //Iterating through an array
    public void iterArr(){
        int[] myArray;
        myArray = new int[5];
        myArray[0] = 8;
        myArray[1] = 6;
        myArray[2] = 7;
        myArray[3] = 5;
        myArray[4] = 3;
        for (int x = 0; x <= 4; x++) {
            System.out.println(myArray[x]);
        }
        
    }

    public int findMax(int[] array) {
        int maxNum = array[0];
        for(int i = 0; i <= array.length -1 ; i++){
            if(array[i] > maxNum){
                maxNum = array[i];
            }
        }
        return maxNum;
    }

    public ArrayList<Integer> oddArray(){
        ArrayList<Integer> y = new ArrayList<Integer>();
        for(int i = 1; i <= 255; i++){
            if(i % 2 == 1){
                y.add(i);
            }
        }
        return y;
    }
}
