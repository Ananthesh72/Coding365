public class secondlargestelement {
    public static void main(String[] args) {
        
        int [] arr = {10 ,5,10};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i : arr){
            if(i > first){
                second = first;
                first = i;
            }else if(i > second && i!=first){
                second = i;
            }
        }
        
        if(second == Integer.MIN_VALUE){
            System.out.println(-1);
        }else{
            System.out.println(first);
            System.out.println(second);
        }

    }
}
