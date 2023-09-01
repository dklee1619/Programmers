class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        var answer = intArrayOf()
        var answer2 = intArrayOf()
        var ia:IntArray = intArrayOf()
        var state = 0
        for(i in 0..arr.size-1)
        {
            if(arr[i] % divisor == 0)
            {
                state = 1
                answer2 = answer2.plus(arr[i])
            }
        }
        if(state == 0)
        {
            answer2 = answer2.plus(-1)
        }
        state = 0
         answer = IntArray(answer2.size) { -1 }
        for(i in 0..answer2.size-1)
        {
            for(j in 0..answer2.size-1)
            {
                if(answer2[i]>answer2[j])
                {
                    state++
                }
            }
            answer[state] = answer2[i]
            state = 0
        }
        return answer
    }
}

// 1. 크기 지정되지 않은 IntArray() 추가후
// 2. ia = ia.plus(arr[i]) 이런식으로 추가해주면 될듯
// 3. 추가할 arr[i]는 for문으로 거른후에
// 4. 그리고 추가할때 state = 1 추가해서
// 5. state != 1이면 answer = answer.plus[-1]
// 6. 이후 오름차순 해주기 오름차순은 이중for문 + 새로운 배열 하나
// 7. 숫자배열 새로 만들기 answer = IntArray(answer2.size) { -1 }
// 8. gpt 답변 : https://chat.openai.com/share/d468e302-51ed-481b-9af9-13ec0f6a3f91