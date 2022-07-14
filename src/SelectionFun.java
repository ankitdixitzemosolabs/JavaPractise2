import java.util.*;
public class SelectionFun {
    public static void isSubstr(String Str,
                                ArrayList<String> arr)
    {

        // Stores if no string is a
        // substring of str
        int flag = 0;

        // Iterate over the array of strings
        for (int i = 0; i < arr.size(); i++)
        {

            // if the current string occur
            // as a substring in Str
            if (arr.get(i).indexOf(Str) != -1) {

                // Print string i
                System.out.println(arr.get(i));
                flag = 1;
            }
        }

        // If no substring exist
        if (flag == 0)
            System.out.print(-1);
    }

    public static void main(String[] args) {
//        Scanner keyboardInput = new Scanner(System.in);
//
//        System.out.println("Welcome to Pub");
//
//        System.out.println("WHat is your age");
//        int age=keyboardInput.nextInt();
//        if(age>25){
//            System.out.println("have a beer");
//        }else{
//            System.out.println("have coke");
//        }
//
//        System.out.println("Thanks for coming.");

        ArrayList<String> arr
                = new ArrayList<>(Arrays.asList(
                "forg", "geek", "ek", "dog", "sfo"));
        String Str = "e";

        isSubstr(Str, arr);
    }
}
