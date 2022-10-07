public class Question {
    
    public static void main(String args[]){
        
        int arr[]={1,2,5,5,7,9,4,2};
        for(int i=0;i<arr.length;i++){
          
                 
                    int  count = 1;  
                  for(int j = i+1; j < arr.length; j++){  
                          if(arr[i] == arr[j]){  
                              arr[j] =-1; 
                              count++; 
                          }  
                      }  
                      if(arr[i]%2!=0)  {
                        System.out.println(arr[i] +":"+count+"times");
                      }
                        
                  }  
            }
        
    }

