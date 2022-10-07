import java.util.*;
class Count{
   static int count=0,rem;
    public static void  main(String args[]){
Scanner obj=new Scanner(System.in);
int num=obj.nextInt();
while(num!=0){
    rem=num%10;
    count++;
    num=num/10;
    
   
}
System.out.println(count);
    }
}