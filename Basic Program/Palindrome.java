import java.util.Scanner;

public class Palindrome {
   static int rev=0,rem,temp;
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        temp=num;
        while(num>0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
           

        }
        if(temp==rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
       
    }
}
