public class binarytodecimal {
    public static void main(String[] args) {

        String str = "10101001";

        int n = str.length();
        // int sum=Integer.parseInt(str,2);
        int sum = 0;
        int pow = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (str.charAt(i) == '1') {
                sum += Math.pow(2, pow);
            }
            pow++;
        }
        System.out.println(sum);
    }
}
