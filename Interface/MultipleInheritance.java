import java.util.*;
interface Basic{
    void method();
}

interface Child {
    void method2();
}

public class MultipleInheritance implements Basic,Child {
   public void method(){
System.out.println("Hello world");
    }
    public void method2(){
System.out.println("Hello");
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(s);
        Basic obj=new MultipleInheritance();
        obj.method();
        Child obj1=new MultipleInheritance();
        obj1.method2();

    }
}
