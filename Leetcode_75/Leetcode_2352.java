import java.util.*;

public class Leetcode_2352 {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        Map<String, Integer> rowMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                sb.append(grid[i][j]).append(",");
            }
            String rowStr = sb.toString();
            rowMap.put(rowStr, rowMap.getOrDefault(rowStr, 0) + 1);
        }

        int count = 0;

        for (int j = 0; j < n; j++) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(grid[i][j]).append(",");
            }
            String colStr = sb.toString();
            count += rowMap.getOrDefault(colStr, 0);
        }

        return count;
    }
    public static void main(String[] args) {
        Leetcode_2352 obj = new Leetcode_2352();
        int[][] grid = {
            {1, 2, 3},
            {2, 3, 1},
            {3, 1, 2}
        };
        System.out.println(obj.equalPairs(grid)); 
    }
}

