class Question1{

static int  method(int [] arr){
    
  return arr[arr.length-2];
   
}
    public static void main(String[] args) {
       int tempVariable;
        int arr[]={-1,-2,-3};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    tempVariable=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tempVariable;
                }
            }
        }
     System.out.println(method(arr));
     
    }
}