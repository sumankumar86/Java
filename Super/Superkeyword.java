class A{
  int a=10;
}
class B extends A{
    int a=5;
    void method(){
        System.out.println(this.a);

    }

}



class Superkeyword{
    public static void main(String args[]){
B obj=new B();
obj.method();
    }
}