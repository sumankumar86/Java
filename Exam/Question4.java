public class Question4{
    static void method(String a){
        System.out.println(a);
    }
    public static void main(String[] args) {
       
        String line = "Java is programming";
        char[] array = line.toCharArray();
        String sentence = "";
        for(int i=0;i<array.length;i++){
            if(line.charAt(i)==' ')
            {
                    continue;
            }else{
                sentence = sentence + line.charAt(i);
            }
        }
        method(sentence);
       }
}