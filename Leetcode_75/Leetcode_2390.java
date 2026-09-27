
public class Leetcode_2390{

    public static String removeStars(String str){
        StringBuilder result = new StringBuilder();

        for(char ch : str.toCharArray()){
            if(ch =='*'){
                if(result.length() >0){
                    result.deleteCharAt(result.length() -1);
                } 
            }else{
                result.append(ch);
                System.out.println(result);  
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str="leet**cod*e";
        System.out.println(removeStars(str));
    }
}
