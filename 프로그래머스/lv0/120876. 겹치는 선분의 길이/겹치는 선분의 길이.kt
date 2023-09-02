class Solution {
    fun solution(lines: Array<IntArray>): Int {
        var answer: Int = 0
        val num1: Int = lines[0][1] - lines[0][0] + 1
        val num2: Int = lines[1][1] - lines[1][0] + 1
        val num3: Int = lines[2][1] - lines[2][0] + 1
        val num1Array = IntArray(num1) { it + lines[0][0] }
        val num2Array = IntArray(num2) { it + lines[1][0] }
        val num3Array = IntArray(num3) { it + lines[2][0] }
//
        var min:Int = 0
        var max:Int = 0
        var count: Int = 0
        var count2: Int = 0
// 이 값이 원소안에 있는지 확인

// 0 ~ 2 / -3 ~ -1 / -2 ~ 1 이렇게 있을 때
// -3 ~ -1 / -2 ~ 1
// 0번째 인덱스중 큰값과 1번째 인덱스중 작은값을 찾으면 됨.
// num1Array.size
// 어떤 한 배열이 있어. 그 배열의 원소가 -3~-1일때
// 다른 배열의 원소와 2개 겹치면 길이1 3개 겹치면 길이2 그렇게 해봐.

//
// 오류.  1,1,2가 작은쪽이면 상관없는데 1,1,2가 큰쪽이면 아래쪽을 못담음. 그래서 클때,작을때 해줘야함.
            for (i in num1Array.indices) {
                for (j in num2Array.indices) {
                    if (num1Array[i] == num2Array[j]) {
                        count++
                        break
                    }
                }
            }
            if (count >= 1) {
                count2 = count2 + count - 1
            }
            count = 0
        
            for (i in num1Array.indices) {
                for (j in num3Array.indices) {
                    if (num1Array[i] == num3Array[j]) {
                        count++
                        break
                    }
                }
            }
            if (count >= 1) {
                count2 = count2 + count - 1
            }
            count = 0
      
            for (i in num2Array.indices) {
                for (j in num3Array.indices) {
                    if (num2Array[i] == num3Array[j]) {
                        count++
                        break
                    }
                }
            }
            if (count >= 1) {
                count2 = count2 + count - 1
            }
            count = 0
        
            // 그리고 3개 겹치는 부분을 안빼서 오류가 발생함

        
                min = maxOf(lines[0][0],lines[1][0],lines[2][0])
        max = minOf(lines[0][1],lines[1][1],lines[2][1])
        if(min<max)
        {count2 = count2 - (max-min)* 2}

        answer = count2
        return answer
    }
}

// 원소 하나에 대해서, [a,b] 일때 배열의 크기가 b-a인 배열 하나 만들기
// 모든 인덱스에 a를 더해주기 그러면 예를들어 [-3,1] 이면 -3,-2,-1,0,1 이 됨
// 그렇게 배열 3개를 만들어줌
// 배열1 , 배열2 , 배열3

// 각 배열의 0번째 인덱스 최솟값가
// 각 배열의 1번째 인덱스 최댓값을 구하고

// for로 최솟값~최댓값을 돌려보며
// 특정 인덱스가 2개이상 있는 겹치는 경우를 찾고
// count는 -1부터 겹칠때마다 늘려서

// 자잘한 오류는 셋째치고 내 논리가 맞는지는 둘째치고 애초에 내가짠거는 점의 갯수를 찾는 느낌이라 잘 안되었음

// 그래서 다시 생각해봄
//