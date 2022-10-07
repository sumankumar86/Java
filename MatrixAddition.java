public class MatrixAddition {
    public static void main(String args[]){
        int arr1[][]={{10,20,30},{40,50,60}};
        int arr2[][]={{40,50,60},{10,50,80}};
        int sum[][]=new int[2][3];
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                sum[i][j]=arr1[i][j]+arr2[i][j];
                System.out.print(sum[i][j]+" ");
                
            }
            System.out.println();
        }
    }
}
