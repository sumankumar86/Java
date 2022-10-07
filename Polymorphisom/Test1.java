class Basic{
   static  int getnum(int a,int b){
return a+b;
    }
    static double getnum(double b,double c){
return c+b;
    }
}
public class Test1 {
    public static void main(String args[]){
        System.out.println(Basic.getnum(11,25));
        System.out.println(Basic.getnum(11.5,25));
    }
}
