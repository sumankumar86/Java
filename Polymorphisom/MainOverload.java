public class MainOverload {
    public static void main(String args[]){
        System.out.println("First");
    }
    public static void main(String arg){
        System.out.println("Second");
    }
    public static void main(){
        System.out.println("Third");
    }
}
