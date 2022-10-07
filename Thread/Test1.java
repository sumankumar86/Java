public class Test1 extends Thread{
    public  void start(){
        System.out.println("Stop Thread");
      
    }


 public static void main(String args[]){
        Test1 obj=new Test1();
        obj.start();
     
       
    }
}

