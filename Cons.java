import java.util.Scanner;

class Cons {
    double rate,time,amount,principal;
    Cons(double rate,double time){
      this.rate=rate;
      this.time=time;
    }
    Cons(double a,double b,double c){
        rate=a;
        time=b;
        principal=c;
    }
    void show(){
        // amount=Math.round((principal*rate*time)/100);

        System.out.println(rate+":"+time+":"+principal);
    }
    void display(){
        System.out.println(rate+ time);
       
     }

    public static void main(String args[]){
      
        // Scanner object1=new Scanner(System.in);
        // principal=object1.nextDouble();
        Cons obj=new Cons(5,2.5);
        Cons obj1=new Cons(5,2.5,1500);
        obj.show();
        obj1.show();
        obj.display();
        
    }
}
