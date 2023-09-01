class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        var longArray = DoubleArray(n + 2)
        longArray[0] = 0.0
        longArray[1] = 1.0
        for (i in 2 until n+1) {
            longArray[i] = (longArray[i - 2] + longArray[i - 1])% 1234567
        }
        
        answer = (longArray[n]).toInt()
        return answer

    }
}
// 코드는 금 쉽게 짯는데 오류가 조금 남.
// 오류를 해결하고나니 어떤 이유인진 모르겟는데 테스트 7부터 계속 실패함.
// 피보나치 수열의 숫자가 너무 큰게 문제일까봐, Long형으로 바꿔줬는데 그래도 안됨.
// 