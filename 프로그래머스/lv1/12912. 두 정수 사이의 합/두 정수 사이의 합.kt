class Solution {
    fun solution(a: Int, b: Int): Long {
        var answer: Long = 0
        var max = 0
        var min = 0
        var size = 0
        if (a > b) {
            max = a
            min = b
        } else {
            max = b
            min = a
        }
        size = max - min + 1
        var ia = IntArray(size){it + min}
        for(i in 0..size-1)
        {
            answer = answer + ia[i]
        }
        return answer
    }
}

// 1. a와 b중 작은것을 정함
// 2. 배열의 크기는 큰거 - 작은거 + 1
// 3. IntArray(배열의크기){it + 작은거}