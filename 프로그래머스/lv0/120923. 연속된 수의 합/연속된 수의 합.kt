class Solution {
    fun solution(num: Int, total: Int): IntArray {
        var answer: IntArray = IntArray(num) {
            if (num % 2 == 0) {
                it + (total / num - num / 2 + 1)
            } else {
                it + (total / num - num / 2)
            }
        }
        return answer
    }
}

// 1. 배열의 크기는 num
// 2. 중앙값은 total / num 
// 3. 배열의 크기 홀수면 인덱스 0은 total / num - n / 2
// 4. 배열의 크기 짝수면 인덱스 0은 total / num - n / 2 + 1
// 5. IntArray(num) {it} 배열의 크기 : num 원소 인덱스0부터 쭉 더해감