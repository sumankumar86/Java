class Parent1{
    int a=10;
}
class Parent2 extends Parent1{
    int a=20;
}
class Child extends Parent2{
    void method(){
        int a=30;
        System.out.println(a);
    }
 
}
public class Hire {
    public static void main(String args[]){
       Child obj=new Child();
       obj.method();
    }
}
