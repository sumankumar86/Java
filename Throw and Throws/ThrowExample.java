class First{
   void method(int a)throws ArithmeticException{
if(a<30){
    throw new ArithmeticException("Error");
}
else{
    System.out.println("Ok");
}
    }
}

class ThrowExample{
    public static void main(String args[]){
First obj=new First();
obj.method(52);
    }
}