public class Thiskeyword {
    void a(){
System.out.println("Method a");
    }
    void b(){
        System.out.println("Method b");
        this.a();
    }
    public static void main(String args[]){
        Thiskeyword obj=new Thiskeyword();
        obj.b();
    }
}
