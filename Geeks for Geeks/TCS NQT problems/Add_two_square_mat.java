public class Add_two_square_mat {
    public static void main(String[] args) {

        int[][] a = { { 1, 2 }, { 3, 4 } };
        int[][] b = { { 4, 3 }, { 2, 1 } };
        int [] [] total = new int[a.length][b.length];
       
        for(int i =0 ;i< a.length;i++){
            for( int j =0;j< b[i].length;j++){
                a[i][j] = a[i][j] + b[i][j];
            }
        }
        for(int [] rows : a){
            for(int colum: rows){
               System.out.println(colum+",");
            }
        }
    }
}
