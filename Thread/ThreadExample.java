class ThreadExample extends Thread{
 
    public void run(){
        System.out.println("Thread start");
    }
    public void Stop(){
        System.out.println("thread stop");
    }
   

    public static void main(String args[]){
        ThreadExample obj=new ThreadExample();
        obj.start();
      

    }
}