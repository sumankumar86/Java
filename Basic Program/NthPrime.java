import java.util.*;
public class NthPrime {
    public static void main(String args[]){
        int number,range,term,count=0;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Range: ");
        range = obj.nextInt();
        System.out.print("Enter term: ");
        term = obj.nextInt();
        for(number=2;number<=range;number++){
            if(prime(number)){
              count++;
              if(term==count){
                System.out.print(number);
              }
            }
        }
    }

    static boolean prime(int n) {
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
