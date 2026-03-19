public class searchinmatrix {
    public static void main(String[] args) {

        // mat[][] = [[6, 23, 21],[4, 45, 32],[69, 11, 87]], x = 32
        int x = 32;
        int[][] mat = { { 6, 23, 21 }, { 4, 45, 32 }, { 69, 11, 87 } };
        searchinmatrix obj = new searchinmatrix();

        boolean res = obj.searchMatrix(mat, x);
        System.out.println(res);
    }

    public boolean searchMatrix(int[][] mat, int x) {

        // System.out.println(mat.length);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (x == mat[i][j]) {
                    return true;
                }
            }
        }

        // for (int[] row : mat) {
        // for (int element : row) {
        // System.out.print(element + " ");
        // }
        // // System.out.println();
        // }

        return false;

    }
}
