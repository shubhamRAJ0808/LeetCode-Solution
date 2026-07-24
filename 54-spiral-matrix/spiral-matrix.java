import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        ArrayList<Integer> ans = new ArrayList<>();

        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {

            // Left to Right
            for (int j = startCol; j <= endCol; j++) {
                ans.add(matrix[startRow][j]);
            }
            startRow++;

            // Top to Bottom
            for (int i = startRow; i <= endRow; i++) {
                ans.add(matrix[i][endCol]);
            }
            endCol--;

            // Right to Left
            if (startRow <= endRow) {
                for (int j = endCol; j >= startCol; j--) {
                    ans.add(matrix[endRow][j]);
                }
                endRow--;
            }

            // Bottom to Top
            if (startCol <= endCol) {
                for (int i = endRow; i >= startRow; i--) {
                    ans.add(matrix[i][startCol]);
                }
                startCol++;
            }
        }

        return ans;
    }
}