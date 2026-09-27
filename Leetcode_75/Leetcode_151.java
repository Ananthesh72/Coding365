public class Leetcode_151{
    public static void main(String[] args) {
        
        String s1 = "Hello World";
        String result = reverseWords(s1);
        System.out.println(result);
    }   
    public static String reverseWords(String str){
        String trim = str.trim();
        System.out.println(trim.split("\\s+"));
        String[] words = trim.split("\\s+");
       
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }
}
