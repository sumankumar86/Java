public class ThrowandThrows {
    static void method()throws Exception{
        throw new ArithmeticException("Error coming");
    }
    public static void main(String args[] ){
       
        try{
            method();
        }
        catch(ArithmeticException e){
System.out.println("Outside  code");

        }
    }
}
