class Solution {
    fun solution(numbers: IntArray): Int {
        var answer: Int = 0
        var num1:Int =0
        var num2:Int = 0
        var num12:Int =0
        var num12best:Int =0
for(i in numbers.indices)
        {num1 = numbers[i]
            for(j in numbers.indices)
            {num2 = numbers[j]
                if((i)!=(j)) // num1 , num2 를 i,j로 고침 num1, num2로 하니까 다른 위치의 같은 크기 원소에 의해 통과 못하는 경우가 발생
                {num12 = num1 * num2}
                if(num12 >= num12best)
                {num12best=num12}
                
            }
        }
        answer = num12best
        return answer
    }
}
// 1. for로 1~10까지 나열하면서
// 2. 다시 for로 2~10까지 곱하고
// 3. 그담은 2~10과 3~10 곱하는식으로.
