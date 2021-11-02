package Chuong4;

public class Ex6 {
    public static void main(String[] args) {
        String s = "Hello Class Java";

        String s1 = "Write Hello Class easily";

        int count = 0;

        for (int i = 0; i < s.length(); i++){
            System.out.println(s.length());
            if(s.charAt(i) == 'a'){
                count++;
            }
        }

        System.out.println("frequency of character a: "+ count);

        int index = s1.indexOf("Java");
// 0 -> s.length()
        if (index != -1){
            System.out.println("string contains the word Java");
        }else{
            System.out.println("string not contains the word Java");
        }

        if (s1.startsWith("Write")){
            System.out.println("string starts with the word Write");
        }else{
            System.out.println("string not starts with the word Write");
        }

        if (s1.endsWith("easily")){
            System.out.println("string ends with the word easily");
        }else{
            System.out.println("string not ends with the word easily");
        }
    }
}
