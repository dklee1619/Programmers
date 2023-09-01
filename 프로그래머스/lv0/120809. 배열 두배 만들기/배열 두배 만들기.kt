class Solution {
    fun solution(numbers: IntArray): IntArray {
        var answer: IntArray = intArrayOf(numbers.size.toInt())
        answer = numbers // 배열의 길이 answer와 numbers 가게 << 이거 없으면 안됫는데 조금헤멤
        for ( i in numbers.indices) // 배열의 인덱스 가져오기
        {answer[i]=2*numbers[i]} // 각 원소 돌때마다 2배로
        return answer
    }
}