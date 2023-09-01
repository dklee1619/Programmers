class Solution {
    fun solution(numbers: IntArray): Int {
        var answer: Int = 45
        for(i in 0..numbers.size-1)
        {
            answer = answer - numbers[i]
        }
        return answer
    }
}

// 1. answer = 45(0~9까지합)까지 다 더함
// 2. numbers의 숫자를 45에서 모두 뺌
