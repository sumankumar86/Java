import java.util.*;

interface Bank {
 float getinterest();
   }
class Sbi implements Bank{
    public float getinterest(){
        return 6;
    }
}
class Punjab implements Bank{
   public float getinterest(){
        return 5;
    }
}
class Canara implements Bank{
    public float getinterest(){
        return 7;
    }
}
class Uco implements Bank{
   public float getinterest(){
        return 5;
    }
}
class Hdfc implements Bank{
  public  float getinterest(){
        return 4;
    }
}
class Interest{
    static int bank;
    static boolean chooseBank=true;
    static double principal, amount,time,interestRate;

    public static void main(String args[]){
        System.out.println("Enter Your Principal:");
        Scanner obj=new Scanner(System.in);
        principal=obj.nextDouble();
        System.out.println("Enter Time Period:");
        time=obj.nextFloat();
        System.out.println("Choose your Bank:");
        bank=obj.nextInt();
        Bank obj1=new Sbi();
        Bank obj2=new Punjab();
        Bank obj3=new Canara();
        Bank obj4=new Uco();
        Bank obj5=new Hdfc();
 
        switch(bank){

            case 0:{
                System.out.println("SBI");
                interestRate=obj1.getinterest();
                System.out.println("Rate of interest:"+interestRate);
                break;
            }
            case 1:{
                System.out.println("PUNJAB");
                interestRate=obj2.getinterest();
                System.out.println("Rate of interest:"+interestRate);
                break;
            }
            case 2:{
                System.out.println("CANARA");
                interestRate=obj3.getinterest();
                System.out.println("Rate of interest:"+interestRate);
                break;
            }
            case 3:{
                System.out.println("UCO");
                interestRate=obj4.getinterest();
                System.out.println("Rate of interest:"+interestRate);
                break;
            }
            case 4:{
                System.out.println("HDFC");
                interestRate=obj5.getinterest();
                System.out.println("Rate of interest:"+interestRate);
                break;
            }
            default:{
                chooseBank=false;
                System.out.println("Choose Valid Bank");
            }
         

        }

        if(chooseBank==true){
            System.out.println("Amount after compound interest");
            amount=(principal*(Math.pow((1+interestRate/100),time)));
             System.out.println(Math.round(amount));
        }

   }
}
