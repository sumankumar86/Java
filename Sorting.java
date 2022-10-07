class Sorting{
    public static void main (String args[]){
        int arr[]={1,5,7,9,10,8,6};
        int i,j,temp;
        for(i=0;i<arr.length;i++){
            for(j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
     
                }
            }
        }
        for(i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        

    }
}