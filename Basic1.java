class Basic{
    int a;String b;
    Basic(){
a=150;
b="Suman";
    }
    void Show(){
        System.out.println(a+","+b);
    }
}

class Basic1{
    public static void main(String args[]){
        Basic obj=new Basic();
        obj.Show();
    }
}
