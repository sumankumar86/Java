public class Example implements Runnable{
    public void run(){
        System.out.println ("Thread continue");
    }

    public static void main(String args[]){
        Example obj=new Example();
        Thread obj1=new Thread(obj);
        obj1.start();
        

        
    }


}
