package assignment4;

public class StringExample {



    String s= "This is a JAVA class ";

    public static void main(String[] args) {
        StringExample se = new StringExample();

        int word =0;
        for (int i=0; i< se.s.length();i++){

            if (se.s.charAt(i) == ' ')
                word++;
        }

        System.out.println("Number of words in the given string are:" + word);
        System.out.println("Length of the string :"+ se.s.length());
        se.reverseString(se.s);
        String words[]=se.s.split("\\s");
        String reversedWord=" ";
        for (String w: words){
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
        }


    }
    public void singleCharacterWord(String s){
        String word1="null";
        int temp=0;
        for (int i=0;i<=s.length(); i++){
            if(s.charAt(i) == ' '){
                word1= s.substring(temp,i);
                temp=i;
            }

            if (word1.length()==1){
                System.out.println("single character word in the string is:"+ word1);
            }
        }
    }

    public void reverseString(String s){
        String reverse ="";
        for (int i= (s.length()-1); i >= 0; i--){
            reverse =reverse + s.charAt(i);
        }
        System.out.println("Reversed String :" + reverse);
    }

}
