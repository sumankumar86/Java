 class ThisTest {
    ThisTest(){
        this(5);
System.out.println("First cons");
    }
    ThisTest(int a){
       
System.out.println(a);
    }
}
class ThisTest2{
    public static void main(String args[]){
        ThisTest obj=new ThisTest();
        


    }
}

