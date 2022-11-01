import java.util.Scanner;

public class PalindromeEx {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number");
        int number = obj.nextInt();
        String demo = String.valueOf(number);
        StringBuffer obj1 = new StringBuffer(demo);
        StringBuffer str = obj1.reverse();

        String str1 = str.toString();
     
        if (str1.equals(demo)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }
}
