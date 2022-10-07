

class Overriding {
 int a=3;
    public void show(){
        System.out.println("Java is Best");
    }
    Overriding(){
        System.out.println("Hello");
    }
   
    
}
class Ridding extends Overriding{
   int a=6;
 public void show(){
    // super.show();
    
    System.out.println("Java is better");
    System.out.println(super.a);
 }
 Ridding(){
    super();
 }
}

public class Override{
    public static void main(String args[]){
        Ridding obj=new Ridding();
        obj.show();
       
     }
    }




