class Solution {
    fun solution(nums: IntArray): Int {
        var answer = -1
        var count = 0
        val size = nums.size
        var num = 0
        for (i in 0..size - 1) {
            for (j in (i + 1)..size - 1) {
                for (k in (j + 1)..size - 1) {
                    num = nums[i] + nums[j] + nums[k]
                    for (l in 3..num - 1) {
                        if ((num % l) == 0) {
                            count--
                            break
                        }
                    }
                    count++
                }
            }
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        println("Hello Kotlin")
        answer = count
        return answer
    }
}
// 1. 소수를 구하는 방법을 알아야하고
// 2. for 3번 하면 될것같다. 그리고 안겹치게 for3번하는방법은 삼총사에서 다룸
// 3. 소수인지 아닌지 판별후 true,false하는 함수가 있는지 물어볼까? 소수 구현하기 귀찮은데.
// 4. 2021년 9월까지 기준으로 없다고하고 함수를 알려줌. 그 함수는 쓰지말고 내가 구현해보자
// 5. 소수라면 2이상의 숫자로 나눠서 나머지가 0이되는경우가 없겟지. 자기자신과만 약수를 가지니까.
