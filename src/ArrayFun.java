import java.util.*;

public class ArrayFun {
    public static void main(String[] args) {

        Scanner keyboardInput= new Scanner(System.in);

        int[] firstArray= new int[5];

        for(int i = 0 ;i<firstArray.length;i++)
        {
            int count=i+1;
            System.out.println("enter " + count + " value");
            firstArray[i]= Integer.parseInt(keyboardInput.nextLine());
        }
        for(int i = 0 ;i<firstArray.length;i++)
        {
            int count=i+1;
            int multipledValue=firstArray[i]*2;
            System.out.println(  count + " value * 2 is equal to " + multipledValue);
        }

    }
}
