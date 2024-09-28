import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        if (matrix.length == 0) return list;

        int startRow = 0;
        int endRow = matrix.length - 1; 
        int startColumn = 0;
        int endColumn = matrix[0].length - 1; 

        while (startRow <= endRow && startColumn <= endColumn) {
            for (int i = startColumn; i <= endColumn; i++) {
                list.add(matrix[startRow][i]);
            }
            startRow++;

            for (int j = startRow; j <= endRow; j++) {
                list.add(matrix[j][endColumn]);
            }
            endColumn--;

            if (startRow <= endRow) {
                for (int k = endColumn; k >= startColumn; k--) {
                    list.add(matrix[endRow][k]);
                }
                endRow--;
            }
            if (startColumn <= endColumn) {
                for (int m = endRow; m >= startRow; m--) {
                    list.add(matrix[m][startColumn]);
                }
                startColumn++;
            }
        }

        return list;
    }
}
