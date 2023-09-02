class Solution {
    fun solution(num_list: IntArray, n: Int): Array<IntArray> {
        var answer: Array<IntArray> = arrayOf<IntArray>()
        for(i in 0..( (num_list.size)/n ) - 1)
        {answer = answer.plus(IntArray(n))
            for(j in 0..n-1)
            {   
                answer[i][j] = num_list[i*n+j]
            }
        }
        return answer
    }
}