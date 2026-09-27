// Leetcode Problem 1071
// Given two strings str1 and str2 of the same length, the string of the same length is called the greatest common divisor of str1 and str2 if it can be obtained by concatenating str1 some number of times.
public class Leetcode_1071 {
    public static void main(String[] args) {
        String s1 = "LEET";
        String s2 = "LEET";

       String result = gcd_of_string (s1,s2);

       System.out.println(result);
                
    }
        
        public static String gcd_of_string(String str1, String str2) {
            if(!(str1 + str2).equals(str1+ str2)){
                return "";               
            }
            int gcd_length = gcd(str1.length(),str2.length());      // WILL GET THE LENGTH OF SUBSTRING WITH GCD PROCESS
            String gcdString = str1.substring(0, gcd_length);       //ABC 

            if (str1.equals(gcdString.repeat(str1.length() / gcd_length)) &&
            str2.equals(gcdString.repeat(str2.length() / gcd_length))) {
            return gcdString;
            }
            return "";
        }
        private static int gcd(int a ,int b){
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }
}
