public class Throws {
    int divide;
    void method(int m,int n){
divide=m/n;
System.out.print(divide);

    }
    public static void  main(String args[]){
        Throws obj=new Throws();
        try{
obj.method(45,0);
        }
        catch(ArithmeticException e){
System.out.println(e);
        }
    }
}
