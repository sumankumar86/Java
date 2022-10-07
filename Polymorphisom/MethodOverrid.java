class Parent{
 void  getnum(){
    System.out.println("Parent Class");
 }
}


public class MethodOverrid extends Parent {
    void getnum(){
        System.out.println("Methodoverride class");
    }
    public static void main(String a[]){
    
        // Parent obj=new Parent();
        // obj.getnum(10,20);
        MethodOverrid obj1=new MethodOverrid();
        obj1.getnum();

    }
}
