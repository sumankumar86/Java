public class Exe {
   static void age(int a){
    if(a<10){
throw new Error("Access Denined");
    }
    else
    System.out.println("Access");
   }
    public static void main(String args[]){
age(20);
    }
}
