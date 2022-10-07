

class First{
    void method2(){
        System.out.println("Second");
    }
 
}
class Second extends First{

   void method(){
        System.out.println("First");
    }

}
class Single{
    public static void main(String args[]){
Second b=new Second();
b.method();
b.method2();
    }
}