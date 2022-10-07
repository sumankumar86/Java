import java.util.*;

public class Question2 {
    static int delete(int [] arr,int a){
        int times=1;
    for(int i=a+1;i<arr.length;i++){
        if(arr[i]==arr[a]){
            arr.remove(i);
            times++;
        }
    }
    return times;
    }
    public static void main(String[] args) {
        // ArrayList<Integer> array=new ArrayList<Integer>();
       
        // array.add(5);
        // array.add(7);
        // array.add(6);
        // array.add(5);
        // array.add(2);
        int array[]={1,5,9,5,5};

        for(int i=0;i<array.length;i++){
            if(array[i]%2!=0){
                System.out.println(array[i]+":"+delete(array,i));
            }
            else{
                array.remove(i);
            }
        }
    }
}