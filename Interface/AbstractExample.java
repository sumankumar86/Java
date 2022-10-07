abstract class Basic{
 abstract void show();

 void display(){
    System.out.println("Hello");
 }

}




class AbstractExample extends Basic{
    void show(){
        System.out.println("Implementation of abstract class");
    }
public static void main(String args[]){
Basic obj=new AbstractExample();
obj.show();
obj.display();


}
}