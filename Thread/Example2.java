public class Example2 extends Thread {
    public void run(){
        try{

            for(int i=0;i<5;i++){
                Thread.sleep(1000);
                System.out.println(i);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
   
    }

    public static void main(String args[]){
        Example2 obj =new Example2();
        obj.start();

    }
}
