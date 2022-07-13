import java.util.Scanner;
public class SelectionFun {

    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        System.out.println("Welcome to Pub");

        System.out.println("WHat is your age");
        int age=keyboardInput.nextInt();
        if(age>25){
            System.out.println("have a beer");
        }else{
            System.out.println("have coke");
        }

        System.out.println("Thanks for coming.");
    }
}
