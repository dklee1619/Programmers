class Solution {
    fun solution(number: IntArray): Int {
        var answer: Int = 0
        val size = number.size
        for (i in 0..size - 1) {
            for (j in (i + 1)..size - 1) {
                for (k in (j + 1)..size - 1) {
                    if ((number[i] + number[j] + number[k]) == 0) {
                        answer++
                    }
                }
            }
        }
        return answer
    }
}
// 1. 학생 번호(음수가능) 세개 더햇을 때 0이면 삼총사
// 2. for 0 ~ size , for 1 ~ size , for 2 ~ size 이렇게 3번돌리면 될거같긴함.
// 3. 이제 문제. 2~size를 하고나서 2번째가 2되고나면 3번째는 3부터 시작해야하는데.
// 4. 머리부터 박으니까 해결해야될 논리가 다시 생겼다.
// 5. 조금 생각해보니까 그냥 어짜피 상위 반복문의 +1번째 니까 i+1 j+1로
// 6. 그리고 size 에러떠서 size-1로 또 고쳐줌. 계속 틀리는 부분.
// 7. gpt 답변 : https://chat.openai.com/share/b147406e-f507-4b31-927e-9f1a2c48abdd(배열의 크기 구하는 size 안떠올라서 1개 질문)
