class Solution {
    fun solution(x: Int): Boolean {
        var answer = true
        var X = x.toString().toCharArray().map { it.toString().toInt() }
        val size = X.size
        var sum = 0
        for(i in 0..size-1)
        {
           sum = sum + X[i] 
        }
        if(x%sum!=0)
        {
            answer = false
        }
        return answer
    }
}

// 1. x를 string 형식으로 바꾸고 char 배열로 바꾸고 다시 int형배열로 바꾼 X를 만듬
// 2. X의 모든 원소의 합을 y라고 하면
// 3. x % y == 0 이 되어야함.
// 4. gpt에게 string형 배열을 int형 배열로 바꾸는 .map { it.toString().toInt() } 를 물어봄
// 5. gpt 답변 : https://chat.openai.com/share/48bfd5ec-189b-4ff3-a01f-9b6f5e8c0009
