public class Stringrev {
    public static void main(String[] args) {
        
        String str = "Ananthesh";
        String newstr = "";
        int n = str.length();
        for(int i =n-1;i >= 0;i--){
            newstr +=str.charAt(i);
        }
        StringBuilder s = new StringBuilder(str);
        System.out.println(s.reverse().toString());
    }
}
