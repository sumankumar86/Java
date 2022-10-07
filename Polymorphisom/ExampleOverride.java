class Car{
  int  getprice(){
    return 0;
  }
}
class Addi extends Car{
int getprice(){
    return 2;
}
}
class Bmw extends Car{
    int getprice(){
        return 4;
    }

}
class Alto extends Car{
    int getprice(){
        return 5;
    }

}





public class ExampleOverride {
    public static void main(String args[]){
    Addi a=new Addi();
    Alto a1=new Alto();
    Bmw b=new Bmw();
    System.out.println(a1.getprice());

    }
}
