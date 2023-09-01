class Solution {
    fun solution(x: Int, n: Int): LongArray {
        var answer = longArrayOf()
        var mutableList: MutableList<Long> = mutableListOf()

        for(i in 0 until n)
        {mutableList.add((i+1)*x.toLong())}
        answer = mutableList.toLongArray()
        return answer
    }
}
// 1. gpt에게 리스트 선언하는것 물어봄
// 2. 리스트 선언후 관련 로직 짜고,
// 3. Long배열로 바꿔서
// 4. 답에 대입하며 될꺼.
// 5. 그러면, 그 로직은 어떻게?
// 6. 우선 val mutableList: MutableList<Int> = mutableListOf() 여기에 원소 넣는법 gpt에게 물어봄
// 7. mutableList.add() for안에 이거 넣으면 되겟다.
// 8. 근데 문법적인 오류 때문에 막힘.
// 9. Int와 Long, 그리고 리스트와 배열, 또 Int형배열과 Long형배열등에서 많은 오류 발생
// 10. gpt 답변 : https://chat.openai.com/share/1a68238a-ced1-4fdb-b219-848183fcbda3