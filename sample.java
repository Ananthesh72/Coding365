public class sample {
    public static void main(String[] args) {
        System.out.println("Hello Ananthesh Shenoy");

        int input = 19;
        int digit = input;
        double sum = 0;
        int i = 0;
        double num = 0;
        while (i < input) {

            if (digit != 0) {
                num = digit % 10;
                sum += Math.pow(num, 2);
            } else {
                num =sum;
                num = digit % 10;
                sum += Math.pow(num, 2);
            }

            if (sum == 1) {
                System.out.println("done");
                break;
            }
            digit /= 10;
            i++;
        }
    }
}
