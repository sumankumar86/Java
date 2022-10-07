public class Test2 {
    public void show(int a){
        if(a<5){
            throw new ArithmeticException("Error");

        }
        else{
System.out.println(a);
        }

    }
    public static void main(String args[]){
        Test2 obj =new Test2();
        obj.show(-3);
    
    }
}
