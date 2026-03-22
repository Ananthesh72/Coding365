public class toggleCase {
    public static void main(String[] args) {
        String s = "geeksForgEeks";//GEEKSfORGeEKS
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for(Character ch : s.toCharArray()){
            
            if(Character.isUpperCase(ch)){
                sb.append(Character.toLowerCase(ch));
            }else{
                sb.append(Character.toUpperCase(ch));
            }
        }
        System.out.println(sb);
    }
}
