
public class palidrone_number {
    public static void main(String[] args) {

        boolean res;

        System.out.println(palidrone_num((int) 123321));
    }

    static boolean palidrone_num(int x) {

        if(x < 0){
            return false;
        }

        int a = x;
        int b = 0;

        while(x > 0){
            int ldigit = x%10;
             b =  (b*10) + ldigit;
            x = x/10; 
        }
        return a == b;
    }
}

//  30 ms 
// static boolean palidrone_num(int n) {
//         String data = Integer.toString(n);

//         if (data.length() <= 2) {
//             return false;
//         }
//         int a = 0;
//         int b = data.length() - 1;

//         System.out.println(data);
//         for (int i = 0; i < b; i++) {

//             if (data.charAt(a) == data.charAt(b)) {
//                 a++;
//                 b--;
//             } else {
//                 return false;
//             }
//         }
//         return true;
//     }