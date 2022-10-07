public class Thistest4 {
    void method1(Thistest4 obj){
System.out.println("Method invoked");
    }
    void method2(String s){
        
        method1(this);
        System.out.println(s);

    }
    public static void main(String args[]) {
        Thistest4 obj=new Thistest4();
        obj.method2("age");
    }
}
