public class rmvowels{
    public static void main(String[]args){

        // String  s = "welcome to geeksforgeeks";
        // String voweols = "AEIOUaeiou";
        
        // // StringBuffer sb = new StringBuffer(sbvweols);
        // // for(int i=0;i<s.length()-1;i++){
        // String replace = s.replaceAll("[AEIOUaeiou]","");
        //     // }

        //     System.out.println(replace);
    
        
        // String str ="geeks  for geeks";
        // str.trim();
        // System.out.println(str.replace(" ", ""));

        // String str1 = "computer", str2= "cat";
        // System.out.println(str1.replaceAll("["+str2+"]", ""));
        StringBuilder sb = new StringBuilder();

        // String sp = "!@#$%^&*(){}():'',.<>? ;";
        // for( int i=0;i<S.length();i++){
            //     char c  = S.charAt(i);
            //     if(sp.indexOf(c) == -1){
                //         sb.append(c);
                //     }
                // }
                // System.out.println(sb);
                // String S = "$Gee*k;s..fo, r'Ge^eks?";
                String S = "{{{}}> *& ^%*)";
        // if(S.replaceAll("[^a-zA-Z]","") == ""){
        //     System.out.println(-1);
        // }else{
        //     System.out.println("fdd");
        // }
        String res = S.replaceAll("[^a-zA-Z]","");
        if(res.isEmpty()){
            System.out.println(-1);
        }else{
            System.out.println(res);
        }

        // System.out.println(((S.replaceAll("[^a-zA-Z]","")) ==null) ? -1:"");
    }
}