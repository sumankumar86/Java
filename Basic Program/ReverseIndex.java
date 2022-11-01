import java.util.*;

public class ReverseIndex {
    public static void main(String args[]) {
        int number, count = 0, oddsum = 0, evensum = 0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a Number:");
        number = obj.nextInt();
        while (number > 0) {
            count++;
            int rem = number % 10;
            if (count % 2 != 0) {
                if (number % 2 == 0) {
                    oddsum = oddsum + rem;
                }

            } else {
                if (number % 2 != 0) {
                    evensum = evensum + rem;
                }

            }
            number /= 10;
        }
        System.out.println("Sum of even number in odd places: " + oddsum);
        System.out.println("Sum of odd number in even places: " + evensum);
    }
}
