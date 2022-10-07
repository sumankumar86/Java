public class Pattern1 {
    public static void main(String args[]){
        int row=5;
        for(int i=0;i<row;i++){
            for(int k=(row-i);k>=0;k--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
            
        }
    }
}
