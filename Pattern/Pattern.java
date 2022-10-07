class Pattern{
    public static void main(String args[]){
pattern1(5);
System.out.println();
pattern2(5);
System.out.println();
pattern3(5,1);
System.out.println();
pattern4(5);
System.out.println();
pattern5(4,5);
    }
    static void pattern1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
               System.out.print(" * ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }


    static void pattern3(int n,int x){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(x+" ");
                x++;
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
System.out.print(" * ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n,int m){
for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
        System.out.print(" * ");
    }
    System.out.println();
}
for(int i=1;i<=m;i++){
    for(int j=0;j<=m-i;j++){
        System.out.print(" * ");
    }
    System.out.println();
}
    }
}