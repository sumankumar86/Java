import java.util.*;

 class Bank {
 float getinterest(){
return 0;
   }
   }
class Sbi extends Bank{
    float getinterest(){
        return 6;
    }
}
class Punjab extends Bank{
    float getinterest(){
        return 5;
    }
}
class Canara extends Bank{
    float getinterest(){
        return 7;
    }
}
class Uco extends Bank{
    float getinterest(){
        return 5;
    }
}
class Hdfc extends Bank{
    float getinterest(){
        return 4;
    }
}
class Interest{
    static int principal,bank;
    static double amount,time,interestRate;

    public static void main(String args[]){
        System.out.println("Enter Your Principal:");
        Scanner obj=new Scanner(System.in);
        principal=obj.nextInt();
        System.out.println("Enter Time Period:");
        time=obj.nextFloat();
        System.out.println("Choose your Bank:");
        bank=obj.nextInt();
        Sbi obj1=new Sbi();
        Punjab obj2=new Punjab();
        Hdfc obj3=new Hdfc();
        Uco obj4=new Uco();
        Canara obj5=new Canara();

        switch(bank){

            case 0:{
                System.out.println("SBI");
                interestRate=obj1.getinterest();
                System.out.println("Rate of interest:"+interestRate);
                break;
            }
            case 1:{
                System.out.println("HDFC");
                interestRate=obj3.getinterest();
                System.out.println("Rate of interest:"+interestRate);
                break;
            }
            case 2:{
                System.out.println("CANARA");
                interestRate=obj5.getinterest();
                System.out.println("Rate of interest:"+interestRate);
                break;
            }
            case 3:{
                System.out.println("PUNJAB");
                interestRate=obj2.getinterest();
                System.out.println("Rate of interest:"+interestRate);
                break;
            }
            case 4:{
                System.out.println("UCO");
                interestRate=obj4.getinterest();
                System.out.println("Rate of interest:"+interestRate);
                break;
            }
            default:{
                System.out.println("Choose Valid Bank:");
            }
         

        }

System.out.println("Amount after compound interest");
      amount=(principal*(Math.pow((1+interestRate/100),time)));
       System.out.println(Math.round(amount));
    


   }
}
