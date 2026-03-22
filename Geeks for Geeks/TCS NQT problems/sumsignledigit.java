public class sumsignledigit {
    public static void main(String[] args) {
        
        int sum =0;
        String str = "abdsf13hdsf3fdg";
        for( char ch : str.toCharArray()){
            if(Character.isDigit(ch)){
                sum += Character.getNumericValue(ch);
            }
        }
        System.out.println(sum);
    }
}
