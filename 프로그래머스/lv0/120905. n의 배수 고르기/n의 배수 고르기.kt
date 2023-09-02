class Solution {
    fun solution(n: Int, numlist: IntArray): IntArray {
   var answer: IntArray = intArrayOf()
        var count = 0
        for(j in 0..numlist.size-1)
        {
           if(numlist[j] % n == 0)
            {answer = answer.plus(numlist[j])
            }
        }
        
        return answer
    }
}

// 1. 배열이라 크기 조절은 못함. 새로운 배열 만들어야함
// 2. for로 n의 배수가 몇개인지 확인하고 size 정함
// 3. for로 size-1만큼 돌려서 원소 추가해줌
// 4. 디버그 해보고 알게된거. var answer: IntArray = intArrayOf(size) 는 사이즈가 아니다. 원소1개를 size로 넣는거.
// 5. 아무리 해도 안되다가 새로운거 알게됨.
// 6. intArrayOf() 는 굳이 크기 안주고 그냥 plus라는 메서드를 사용해주면 됨
// 7. answer = answer.plus(numlist[j])
// 8. gpt 답변 : https://chat.openai.com/share/f4d5df47-8a02-44a0-b780-775e349d32be