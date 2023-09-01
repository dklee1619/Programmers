class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        answer = num_list.copyOf() // 배열의 길이 같게해주기 없으면 오류남
        // 계속 오류나서 gpt한테 물어보니 문제는 answer 배열과 num_list 배열이 같은 배열 객체를 참조하고 있기 때문입니다. 따라서 answer 배열을 변경하면 num_list 배열도 함께 변경되는 현상이 발생합니다. 이러한 문제를 피하기 위해서는 answer 배열을 num_list 배열의 복사본으로 만들어야 합니다.
        // 라고 해서 copyOf() 로 만들어줌
        var num:Int = num_list.size - 1 // num은 num_list의 배열의길이에서 1뺌(인덱스는 0부터시작해서)
         for(i in answer.indices)
         { answer[i]=num_list[num-i] }
        // for( i in 0..num)
        // {answer[i]=num_list[num-i]}
        return answer
    }
}