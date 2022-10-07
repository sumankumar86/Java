
public class Test2 {
   
    public static void main(String args[]){
        try{
            for(int i=0;i<5;i++){
                Thread.sleep(2000);
                System.out.println("Suman");
            }
     }
     catch(Exception e){
        System.out.println(e);
     }
        

    }
}
