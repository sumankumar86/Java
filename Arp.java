import java.lang.reflect.Array;
import java.util.*;
public class Arp {
    public static int  getlarge(int[]array,int total){
        Arrays.sort(array);
        return array[total-1];
    }
    public static void main(String args[]){
        int array[]={1,2,4,6};
        System.out.println("The Largest Element is:"+ getlarge(array,4));
}}
