import java.util.*;

public class Question2 {
    static int delete(ArrayList<Integer> array2,int a){
        int times=1;
    for(int i=a+1;i<array2.size();i++){
        if(array2.get(i)==array2.get(a)){
            array2.remove(i);
            times++;
        }
    }
    return times;
    }
    public static void main(String[] args) {
        ArrayList<Integer> array=new ArrayList<Integer>();
       
        array.add(5);
        array.add(7);
        array.add(6);
        array.add(5);
        array.add(2);

        for(int i=0;i<array.size();i++){
            if(array.get(i)%2!=0){
                System.out.println(array.get(i)+":"+delete(array,i));
            }
            else{
                array.remove(i);
            }
        }
    }
}