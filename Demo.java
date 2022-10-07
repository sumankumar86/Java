class Remove{

    Remove(int a[]){
       for(int i=0;i<a.length;i++){
        System.out.println(a[i]);
       }
    }
    void Show(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
           }
    }
    static void show2(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
            
           }
    }
}
class Demo{
    public static void main(String args[]){
       
        int arr[]={1,2,3,4};
        Remove.show2(arr);
        //Remove obj=new Remove(arr);
        // obj.Show( arr);
        
        
    }
}
