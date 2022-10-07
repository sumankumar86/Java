
import java.util.Scanner;

public class TryCache {
     static int number1,number2,divide;
    public static void main(String args[]){
        Scanner obj3=new Scanner(System.in);
      number1=obj3.nextInt();
      number2=obj3.nextInt();
        try{
            try{
                if(number2==0){
                    throw new Exception("ERROR");
                }
               
            }
            finally{
                System.out.println("Msg2");
            }
            divide=number1/number2;
            System.out.println(divide);
        }
          
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
            catch(ArithmeticException e){
                System.out.println(e);
            }
            catch(NumberFormatException e){
                System.out.println(e);
            }
            catch(Exception e){
                System.out.println(e);
            }
            finally{
                System.out.println("Hello");
            }
         
        }
      
  
        
    }

