class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = intArrayOf()
        var answer2 = intArrayOf()
        var count = 0
        var count2 = 0
        answer = IntArray(commands.size) { 0 }
        for (i in 0..commands.size - 1) {
            for (j in commands[i][0] - 1..commands[i][1] - 1) {
                answer2 = answer2.plus(array[j])
                if (j == (commands[i][1] - 1)) {
                    for (k in 0..answer2.size - 1) {
                        for (l in 0..answer2.size - 1) {
                            if ((answer2[k] > answer2[l])&&(k!=l)) {
                                count++
                            }else if((answer2[k] == answer2[l])&&(k!=l)) {
                                count2++
                            }
                        } // for(l)
                        if ((commands[i][2] >= (count + 1))&&(commands[i][2] <= (count + 1)+count2)) {
                            answer[i] = answer2[k]
                        }
                        count = 0 // count는 for(k) 한번 돌때마다 초기화.
                        count2 = 0 // count2는 for(k) 한번 돌때마다 초기화.
                    } // for(k)
                } // if
            } // for(j)
            answer2 = intArrayOf() // answer2도 i가 바뀔때마다 초기화 해주어야함.
        } // for(i)

        return answer
    }
}

// 1. commands[i] 로 각 배열을 꺼낼 수 있는듯.
// 2. commands[i][0]-1은 index1 commands[i][1]-1은 index2
// 3. 그다음 정렬하고 commands[i][2]-1번째 인덱스 빼오면 됨.
// 4. 채점후 5/7임. 뭐가 문제가 있을까
// 5. for(j) 에서 배열 다 만들고 for(k)로 넘어가야하는데 그러지 못하는 느낌.
// 6. 그래서 if를 만들고 인덱스 끝까지 다 채워야 넘어가게 해는데 여전히 오류발생.
// 7. 아.. 혹시 원소 같은경우 생각 안했는데? 그게문제일듯?
// 8. gpt 입력 답변 : https://chat.openai.com/share/fddeda20-a9e8-4ff8-ab5f-872dd45b73f3