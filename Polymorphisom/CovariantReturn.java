class A1{
   A1 result(){
    return this;
   }
   void show(){
    System.out.println("First code");
   }
}
class A2 extends A1{
    @Override
    A2 result(){
        return this;
    }
    @Override
    void show(){
        System.out.println("Second code");
       }

}
class A3 extends A2{
    @Override
    A3 result(){
        return this;
    }
    @Override
    void show(){
        System.out.println("Third code");
       }

}



public class CovariantReturn {
    public static void main(String args[]){
A1 obj=new A1();
obj.result().show();
A2 obj1=new A2();
obj1.result().show();
A3 obj2=new A3();
obj2.result().show();
    }
}
