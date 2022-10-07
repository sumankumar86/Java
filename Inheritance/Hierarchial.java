import java.util.*;
class Animal{
    void method(int a){
        
        System.out.println(a);
      
    }
}
class Dog extends Animal{
    void method1(){
       System.out.println("jbhghg");
       
    }
}
class Cow extends Animal{
    void method2(String a){
        super.method(4);
System.out.println(a);
    }
}




class Hierarchial{
    public static void main(String args[]){
        Cow obj=new Cow();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter name");
        String name=sc.nextLine();
        obj.method2(name);
        Dog obj1 =new Dog();
        obj1.method1();
       

    }
}