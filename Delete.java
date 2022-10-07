public class Delete {
    static int[] Remove(int[] arr, int a){
        int[] narr=new int[arr.length-1];
        for(int i=0,m=0;i<arr.length;i++){
            if(i==a){
                continue;
            }
            narr[m++]=arr[i];
        }
        return narr;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,5,8,5,7,-1,2};
        for(int i=0;i<arr.length;i++){
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    arr=Remove(arr,j);
                }
            }
            System.out.print(arr[i]+" is "+count+" times\n");
        }
    }
}