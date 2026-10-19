/*Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".


altPairs("kitten") → "kien"
altPairs("Chocolate") → "Chole"
altPairs("CodingHorror") → "Congrr"*/ 



public class  altPairs {
   public static void main(String[] args) {
      String str="CodingHorror";
     String result = altPairs(str.endsWith(str));
   //   String result = altPairs_(str.startsWith(str));
     System.out.println(result);
   }

   private static String altPairs_(String s){ //0,1, 4,5, 8,9
    StringBuilder sb= new StringBuilder();
    if(s == null || s.length()<=1){
        return s;
    }else
    {
        
       for(int i =0;i<s.length();i+=4){
        sb.append(s.charAt(i));
        if(i+1 < s.length()){
            sb.append(s.charAt( i + 1));
        }
       }
    }
    return sb.toString();
   }
}

