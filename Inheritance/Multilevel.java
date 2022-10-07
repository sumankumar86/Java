class Animal{
void m1(){
System.out.println("First");
}
}
class Dog extends Animal{
    void m2(int a){
System.out.println(a);
    }

}
class Goat extends Dog{
void m3(){
this.m2(5);
System.out.println("Last");
}
}

public class Multilevel {
    public static void main(String args[]){
        Goat g=new Goat();
        g.m3();
        g.m1();

    }
}
