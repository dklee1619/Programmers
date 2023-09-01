class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        var answer = arrayOf<IntArray>()
        val numRows = arr1.size // 행의 개수
        val numCols = arr1[0].size // 열의 개수 (모든 행의 열 개수가 동일하다고 가정)
        answer = Array(numRows) { IntArray(numCols) }

        for(i in 0..numRows-1)
        {
            for(j in 0..numCols-1)
            {
                answer[i][j] = arr1[i][j] + arr2[i][j]
            }
        }
        return answer
    }
}

// 1. 2차원 배열 다루기 도전
// 2. gpt한테 행과 열 크기 구하는거 전수받음.
// 3. gpt 답변 : https://chat.openai.com/share/976f8e0e-c848-43a2-8a98-d041af45e1ee