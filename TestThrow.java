import java.io.IOException;

class Throw{
void method() throws Exception{
    if(a<10){
        throw new Exception("Error");
    }
    else{
System.out.println("Ok");
    }

}

}




public class TestThrow {
    public static void main(String args[]){
        Throw obj=new Throw();
        obj.method(5);

// try{
//     Throw obj=new Throw();
// obj.method();
// }
// catch(Exception e){
//     System.out.println("Exception Handled");

// }

    }
    
}
