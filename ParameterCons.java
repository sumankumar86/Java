public class ParameterCons {
    int id;
    String  name;
    ParameterCons (int i, String c){
        id=i;
       name=c;

    }
 void Display(){
    System.out.println(id+","+name);
}
    public static void main(String args[]){
        ParameterCons obj=new ParameterCons(200,"Suman");
       obj.Display();
    }
}
