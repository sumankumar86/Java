interface Basic{
    void show();
}

 class A implements Basic{
public void show(){
System.out.println("First Code");
}
}

class B implements Basic{
    public void show(){
        System.out.println("Second Code");
    }
}

class C implements Basic{
    public void show(){
System.out.println("Third Code");
    }
}


public class InterfaceTest {
    public static void main(String args[]){
Basic obj=new A();
obj.show();

    }
}
