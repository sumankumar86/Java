import java.util.*;

class TwinPrime {

    public static void main(String args[]) {
        int number, range;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Range: ");
        range = obj.nextInt();
        for (number = 2; number <= range; number++) {
            if (prime(number) && prime(number + 2)) {
                System.out.print("(" + number + "," + (number + 2) + ")");
            }
        }
    }

    static boolean prime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                
                return false;
                
            }
        }
        return true;
    }
}
