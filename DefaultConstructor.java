public class DefaultConstructor {
    int id;
    String name;
    //Default Constructor which returns 0 and null
    void display(){
        System.out.println(id+","+name);
    }
    public static void main (String args[]){
        //Object Creation 
        DefaultConstructor obj=new DefaultConstructor();
        obj.display();
    }
}
