class Basic{
      static int method1(int a ,int b){
      
        return a+b;
     }
     static int method1(int a ,int b,int c){
     
        return a+b+c;
     }
}
class MethodOverloading{
    public static void main(String args[]){
System.out.println(Basic.method1(10,25));
System.out.println(Basic.method1(10,25,25));

 }
}