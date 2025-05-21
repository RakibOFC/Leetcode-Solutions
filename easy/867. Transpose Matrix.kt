class Solution {
    fun transpose(matrix: Array<IntArray>): Array<IntArray> {
        val rowCount = matrix.size
        val colCount = matrix[0].size
        val transpose = Array(colCount) { IntArray(rowCount) }

        for (i in 0..<rowCount) {
            for (j in 0..<colCount) {
                transpose[j][i] = matrix[i][j]
            }
        }

        return transpose
    }
}
