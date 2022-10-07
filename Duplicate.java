public class Duplicate{  
  
      
    public static void main(String[] args) {  
          
        int i,j;
        
        int [] arr = {1, 2, 8, 3, 7, 2, -2, 5, 1};  
              
        for(i = 0; i < arr.length; i++){  
          int  count = 1;  
        for(j = i+1; j < arr.length; j++){  
                if(arr[i] == arr[j]){  
                    arr[j] =-1; 
                    count++; 
                }  
            }  
            if(arr[i] != -1)  
               System.out.println(arr[i] +":"+count+"times");
        }  
        
       
    }  
}