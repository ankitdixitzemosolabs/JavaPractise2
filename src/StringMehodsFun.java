import java.util.*;

public class StringMehodsFun {
    public static void main(String[] args) {
        Scanner keyboardInput= new Scanner(System.in);

        System.out.println("Enter Full Name ");
        String fullName=keyboardInput.nextLine();
        int indexOfSpace=fullName.indexOf(" ");
        String firstName=fullName.substring(0,indexOfSpace).toUpperCase();
        String lastName=fullName.substring(indexOfSpace+1).toLowerCase();

        System.out.println("full Name is "+ fullName);
        System.out.println("first Name is "+ firstName);
        System.out.println("last Name is "+ lastName);
    }
}
