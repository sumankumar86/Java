abstract class Basic{
abstract void method();

}
 class Basic2 extends Basic{
    void method(){
        System.out.println("Hello");
    }
   
}
class Basic3 extends Basic{
    void method(){
        System.out.println("Hello world");
    }
}







public class Test1 {
    public static void main(String args[]){
Basic obj=new Basic3();
obj.method();
    }
}
