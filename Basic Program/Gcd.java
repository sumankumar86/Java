import java.util.*;
public class Gcd {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter first Number:");
        int number1=obj.nextInt();
        System.out.println("Enter second Number:");
        int number2=obj.nextInt();
        int gcd=1;
        for(int i=1;i<=number1&&i<=number2;i++){
            if(number1%i==0&& number2%i==0){
              gcd=i;
                continue;
            }
        }
        System.out.println("Gcd of"+number1 +" & "+number2 +" is " +gcd);
    }
}
