import java.util.Scanner;

public class Factorial {
    public static void main(String args[]){
        int fact=1;
        Scanner object=new Scanner(System.in);
        int num=object.nextInt();
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
